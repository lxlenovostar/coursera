import sys
sys.path.append("gen-py")
from hello import HelloSvc

from thrift.transport import TSocket 
from thrift.transport import TTransport 
from thrift.protocol import TBinaryProtocol

trans_ep = TSocket.TSocket("localhost", 9095)
trans_buf = TTransport.TBufferedTransport(trans_ep)
proto = TBinaryProtocol.TBinaryProtocol(trans_buf)
client = HelloSvc.Client(proto)

trans_ep.open()
msg = client.hello_func()
print("[Client] received: %s" % msg)
