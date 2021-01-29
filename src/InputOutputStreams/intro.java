/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
IOSTREAM->to read files
Stream->logical connection between prg and java app or input output devices,it can be a io device,software
*it is a logical connection because we cannot see the connection
*it is a path in which data is to be sending and receive
2 types
*input stream->to read input
*output stream ->after doning process,to send the information
we cannot use a single stream for both sending and recreiving
source=>inputstream(to give input to the prgrm)->keyboard,mouse,socket( from other system send to other network->combi of ip addres and port address=>mainly for networking),DB(other software),object,array,string,StringBuffer
Destination=>outputstream->monitor(console),file,socket,DB(wanted to modify data already have in DB),obj,arr,str,StringBuffer
Depending on the type of data,2 types--->
Binary stream(also called as Bytestream(8 bit)=>i/p o/p->since byte by byte storing a character)->for handling binary info(from jdk 1.0)
Character stream->for handling char info(from jdk 1.1)=>reader writer->take two byte for storig a char->because it is uesd universal in java)=>thi is called unicode(UNIVERSAL CODE)->used for otherv languages too
BinaryFiles of Binary stream->Eg:img files,audio file,video file
CharacterFile of Character stream->Eg:Text file          
two important methods for above:there are many methods but these two are important
read()
write()
BYTESTREAM:
object(java.lang)->main class
java.io
InputStream(Abstract cls)->(CANT CREATE OBJ,SINCE ABSTRACT CLS)->Abstract class closeable,Autocloseable(java.lang)
*FileInputStream->to read one file 
*array as an input but this array is a byte array(input should be only in byte)
*extra functionality given to thr prgrm
three types
*input can be get by primitive datatype
*fasten the process->Cpu will work fast,but i/po/p system will be slow,so to get thei/p,cpu have to wait->to overcome this waitng BufferInputStream is used
//for OUTTTPUT*support primitive type data->to printing information in the console=>console print()=>Console(where we are getting o/p)
ObjectInputStream->
*class stdent
{

name,rollno,mark,dept;//63 obj(present in heap memory) for cse a
)
after closong heap memory will be deleted,to store it premanently,we are storing as obj permanently here
PipedInputStream(have common data)
*to arrange,to sort and to parallel works->do diff operations on the common data
SequenceInputStream:
*giving morethan one files as input stream->for reading n no of files
StringBufferInputstream->
*for handling strings
OUTPUTSTREAM->ARE ALL CONCREATE CLASS
METHODS OF INPUT STRAM://CHECKED EXCEPTION
*no of bytes going to be present in the particular stream.[it is i/po/pexception->since it is the outside world)
*after making use of file->to close the file properly
*read the content from my file(read byte by byte->i.e=>one byte at a time)
*by using constructor->we can read many files at a atime
*=>(if dont want to store full location)if 100 bytes are there,but need to read only 10 files,we can use this method->[5(from 5),3(to three]
*whether u can mark ur file or not->if true=>in anyfile u mark it,if false->in the given position it will will mark
*fromwhere u wanted to mark it// if  200,it will read from 201
*
*to skip 10 byte...
METHODS FOR OUUTPUT STRAE:
*
*
*
*
*FLUSH()=>CLEAR THE STREAM->
*closeable->an interface available in jdk(1.5)(present in java.io)->to safely closoing
close() moved to an interface in jdk 1.7
*autocloseable(jdk 1.7)->automatically it will be closing it(present in java.lang package->dont need to specify expicitly(it will be takinf implicintly)
through Datainput interface->DATAiNPUTsTREAM
THROGH 
FLUSH METHOD IS MOVED ON TO FLUSHABLE INTERFACE
*/
package InputOutputStreams;

/**
 *
 * @author velmurugan
 */
public class intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
