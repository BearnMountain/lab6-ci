import chisel3._

// stores node information
class NodeIO(
  key_width: UInt,
  value_width: UInt,
) extends Bundle {
  val push = Input(Bool())
  val key_in = Input(UInt(key_width.W))
  val value_in = Input(UInt(value_width.W))
  val full = Output(Bool())

  val pop = Input(Bool())
  val key_out = Input(UInt(key_width.W))
  val value_out = Input(UInt(value_width.W))
  val empty = Output(Bool())
}

class NodeStage(
  key_width: UInt,
  value_width: UInt,
) extends Module {
  val io = IO(new NodeIO(key_width, value_width))
  val key = RegInit(0.U(key_width.W))
  val value = RegInit(0.U(value_width.W))
  val valid = RegInit(false.B) // data can operate

  
}


// class PriorityQueue (
//   key_width: UInt,
//   value_width: UInt,
//   depth: UInt, // number of nodes
// ) extends Module {
//   // private val queue = 
//
//   def push(c: T) = {
//
//   }
//   def pop(c: T): T = {
//
//   }
//
// }
