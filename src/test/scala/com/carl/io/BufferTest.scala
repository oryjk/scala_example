package com.carl.io

import java.io.{FileInputStream, FileOutputStream}
import java.nio.{ByteBuffer, IntBuffer}

import com.carl.BaseTestKit
import org.slf4j.{Logger, LoggerFactory}

class BufferTest extends BaseTestKit {

  private val logger: Logger = LoggerFactory.getLogger(getClass)

  it should "buffer" in {

    val buffer = IntBuffer.allocate(4)

    logger.info("-------------------------")
    logger.info(s"position = ${buffer.position()}")
    logger.info(s"limit = ${buffer.limit}")
    logger.info(s"capacity = ${buffer.capacity()}")


    buffer.put(10)
    buffer.put(20)
    buffer.put(30)
    buffer.put(40)
    logger.info("-------------------------")
    logger.info("write 10")

    logger.info(s"position = ${buffer.position()}")
    logger.info(s"limit = ${buffer.limit}")
    logger.info(s"capacity = ${buffer.capacity()}")

    buffer.flip()
    logger.info("-------------------------")
    logger.info("flip")

    logger.info(s"position = ${buffer.position()}")
    logger.info(s"limit = ${buffer.limit}")
    logger.info(s"capacity = ${buffer.capacity()}")

    val result = buffer.get()
    logger.info("-------------------------")
    logger.info(s"result $result")

    logger.info(s"position = ${buffer.position()}")
    logger.info(s"limit = ${buffer.limit}")
    logger.info(s"capacity = ${buffer.capacity()}")

    buffer.mark()
    buffer.get()
    buffer.get()
    buffer.get()
    buffer.reset()
    val result1 = buffer.get()
    logger.info(s"mark position 1 and get 2,3,4, then reset, the result is 20 = $result1")


  }

  it should "copy a file" in {
    val inputStream = new FileInputStream("/Users/carlwang/derby.log")
    val outputStream = new FileOutputStream("/Users/carlwang/derby_copy.log")

    val inputChannel = inputStream.getChannel
    val outputChannel = outputStream.getChannel

    val buffer = ByteBuffer.allocate(690)

    while (inputChannel.read(buffer) != -1) {
      logger.info("read from input channel")
      buffer.flip()

      while (outputChannel.write(buffer) != 0) {
        logger.info("write to output channel")
      }
      buffer.clear()
    }

    inputChannel.close()
    outputChannel.close()


  }
}
