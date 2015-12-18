//
// Generated by protoc, do not edit by hand.
//
package org.apache.activemq.leveldb.record;


public class EntryKey implements org.fusesource.hawtbuf.proto.PBMessageFactory<EntryKey.Bean, EntryKey.Buffer> {

   public static final EntryKey FACTORY = new EntryKey();
   public static final org.fusesource.hawtbuf.proto.PBMessageFramedCodec<Buffer> FRAMED_CODEC = new org.fusesource.hawtbuf.proto.PBMessageFramedCodec<Buffer>(FACTORY);
   public static final org.fusesource.hawtbuf.proto.PBMessageUnframedCodec<Buffer> UNFRAMED_CODEC = new org.fusesource.hawtbuf.proto.PBMessageUnframedCodec<Buffer>(FACTORY);

   public Bean create()  {
      return new Bean();
   }

   public Bean parseUnframed(org.fusesource.hawtbuf.proto.CodedInputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
      return new Bean().mergeUnframed(data);
   }

   public Bean parseUnframed(java.io.InputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
      return parseUnframed(new org.fusesource.hawtbuf.proto.CodedInputStream(data));
   }

   public Buffer parseUnframed(org.fusesource.hawtbuf.Buffer data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
      return new Buffer(data);
   }

   public Buffer parseUnframed(byte[] data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
      return parseUnframed(new org.fusesource.hawtbuf.Buffer(data));
   }

   public Buffer parseFramed(org.fusesource.hawtbuf.proto.CodedInputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
      int length = data.readRawVarint32();
      int oldLimit = data.pushLimit(length);
      Buffer rc = parseUnframed(data.readRawBytes(length));
      data.popLimit(oldLimit);
      return rc;
   }

   public Buffer parseFramed(org.fusesource.hawtbuf.Buffer data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
      try {
         org.fusesource.hawtbuf.proto.CodedInputStream input = new org.fusesource.hawtbuf.proto.CodedInputStream(data);
         Buffer rc = parseFramed(input);
         input.checkLastTagWas(0);
         return rc;
      } catch (org.fusesource.hawtbuf.proto.InvalidProtocolBufferException e) {
         throw e;
      } catch (java.io.IOException e) {
         throw new RuntimeException("An IOException was thrown (should never happen in this method).", e);
      }
   }

   public Buffer parseFramed(byte[] data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException {
      return parseFramed(new org.fusesource.hawtbuf.Buffer(data));
   }

   public Buffer parseFramed(java.io.InputStream data) throws org.fusesource.hawtbuf.proto.InvalidProtocolBufferException, java.io.IOException {
      return parseUnframed(org.fusesource.hawtbuf.proto.MessageBufferSupport.readFrame(data));
   }

   public interface Getter extends org.fusesource.hawtbuf.proto.PBMessage<EntryKey.Bean, EntryKey.Buffer> {

      // required int64 collection_key = 1;
      public boolean hasCollectionKey();
      public long getCollectionKey();
      // required bytes entry_key = 2;
      public boolean hasEntryKey();
      public org.fusesource.hawtbuf.Buffer getEntryKey();
      public Bean copy();
      public Buffer freeze();
      public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix);
   }

   static public final class Bean implements Getter {

      Buffer frozen;
      Bean bean;

      public Bean() {
         this.bean = this;
      }

      public Bean(Bean copy) {
         this.bean = copy;
      }

      public Bean copy() {
         return new Bean(bean);
      }

      public boolean frozen() {
         return frozen!=null;
      }

      public Buffer freeze() {
         if( frozen==null ) {
            frozen = new Buffer(bean);
            assert deepFreeze();
         }
         return frozen;
      }

      private boolean deepFreeze() {
         frozen.serializedSizeUnframed();
         return true;
      }

      private void copyCheck() {
         assert frozen==null : org.fusesource.hawtbuf.proto.MessageBufferSupport.FORZEN_ERROR_MESSAGE;
         if (bean != this) {
            copy(bean);
         }
      }

      private void copy(Bean other) {
         this.bean = this;
         this.f_collectionKey = other.f_collectionKey;
         this.b_collectionKey = other.b_collectionKey;
         this.f_entryKey = other.f_entryKey;
      }

      // required int64 collection_key = 1;
      private long f_collectionKey = 0;
      private boolean b_collectionKey;

      public boolean hasCollectionKey() {
         return bean.b_collectionKey;
      }

      public long getCollectionKey() {
         return bean.f_collectionKey;
      }

      public Bean setCollectionKey(long collectionKey) {
         copyCheck();
         this.b_collectionKey = true;
         this.f_collectionKey = collectionKey;
         return this;
      }

      public void clearCollectionKey() {
         copyCheck();
         this.b_collectionKey = false;
         this.f_collectionKey = 0;
      }

      // required bytes entry_key = 2;
      private org.fusesource.hawtbuf.Buffer f_entryKey = null;

      public boolean hasEntryKey() {
         return bean.f_entryKey!=null;
      }

      public org.fusesource.hawtbuf.Buffer getEntryKey() {
         return bean.f_entryKey;
      }

      public Bean setEntryKey(org.fusesource.hawtbuf.Buffer entryKey) {
         copyCheck();
         this.f_entryKey = entryKey;
         return this;
      }

      public void clearEntryKey() {
         copyCheck();
         this.f_entryKey = null;
      }

      public String toString() {
         return toString(new java.lang.StringBuilder(), "").toString();
      }

      public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
         if(  hasCollectionKey() ) {
            sb.append(prefix+"collection_key: ");
            sb.append(getCollectionKey());
            sb.append("\n");
         }
         if(  hasEntryKey() ) {
            sb.append(prefix+"entry_key: ");
            sb.append(getEntryKey());
            sb.append("\n");
         }
         return sb;
      }

      public Bean mergeUnframed(java.io.InputStream input) throws java.io.IOException {
         return mergeUnframed(new org.fusesource.hawtbuf.proto.CodedInputStream(input));
      }

      public Bean mergeUnframed(org.fusesource.hawtbuf.proto.CodedInputStream input) throws java.io.IOException {
         copyCheck();
         while (true) {
            int tag = input.readTag();
            if ((tag & 0x07) == 4) {
               return this;
            }
            switch (tag) {
            case 0:
               return this;
            default: {
               input.skipField(tag);
               break;
            }
            case 8:
               setCollectionKey(input.readInt64());
               break;
            case 18:
               setEntryKey(input.readBytes());
               break;
            }
         }
      }
      public boolean equals(Object obj) {
         if( obj==this )
            return true;
         
         if( obj==null || obj.getClass()!=Bean.class )
            return false;
         
         return equals((Bean)obj);
      }
      
      public boolean equals(Bean obj) {
         if (hasCollectionKey() ^ obj.hasCollectionKey() ) 
            return false;
         if (hasCollectionKey() && ( getCollectionKey()!=obj.getCollectionKey() ))
            return false;
         if (hasEntryKey() ^ obj.hasEntryKey() ) 
            return false;
         if (hasEntryKey() && ( !getEntryKey().equals(obj.getEntryKey()) ))
            return false;
         return true;
      }
      
      public int hashCode() {
         int rc=2066384;
         if (hasCollectionKey()) {
            rc ^= ( -22299967^(new Long(getCollectionKey())).hashCode() );
         }
         if (hasEntryKey()) {
            rc ^= ( -2029038419^getEntryKey().hashCode() );
         }
         return rc;
      }
      
      public Bean mergeFrom(Getter other) {
         copyCheck();
         if (other.hasCollectionKey()) {
            setCollectionKey(other.getCollectionKey());
         }
         if (other.hasEntryKey()) {
            setEntryKey(other.getEntryKey());
         }
         return this;
      }

      public void clear() {
         clearCollectionKey();
         clearEntryKey();
      }

      public void readExternal(java.io.DataInput in) throws java.io.IOException {
         assert frozen==null : org.fusesource.hawtbuf.proto.MessageBufferSupport.FORZEN_ERROR_MESSAGE;
         bean = this;
         frozen = null;
         f_collectionKey = in.readLong();
         b_collectionKey = true;
         {
            int size = in.readInt();
            if( size>=0 ) {
               byte b[] = new byte[size];
               in.readFully(b);
               f_entryKey = new org.fusesource.hawtbuf.Buffer(b);
            } else {
               f_entryKey = null;
            }
         }
      }

      public void writeExternal(java.io.DataOutput out) throws java.io.IOException {
         out.writeLong(bean.f_collectionKey);
         if( bean.f_entryKey!=null ) {
            out.writeInt(bean.f_entryKey.getLength());
            out.write(bean.f_entryKey.getData(), bean.f_entryKey.getOffset(), bean.f_entryKey.getLength());
         } else {
            out.writeInt(-1);
         }
      }

   }

   static public final class Buffer implements org.fusesource.hawtbuf.proto.MessageBuffer<EntryKey.Bean, EntryKey.Buffer>, Getter {

      private Bean bean;
      private org.fusesource.hawtbuf.Buffer buffer;
      private int size=-1;
      private int hashCode;

      private Buffer(org.fusesource.hawtbuf.Buffer buffer) {
         this.buffer = buffer;
      }

      private Buffer(Bean bean) {
         this.bean = bean;
      }

      public Bean copy() {
         return bean().copy();
      }

      public Buffer freeze() {
         return this;
      }

      private Bean bean() {
         if (bean == null) {
            try {
               bean = new Bean().mergeUnframed(new org.fusesource.hawtbuf.proto.CodedInputStream(buffer));
               bean.frozen=this;
            } catch (org.fusesource.hawtbuf.proto.InvalidProtocolBufferException e) {
               throw new RuntimeException(e);
            } catch (java.io.IOException e) {
               throw new RuntimeException("An IOException was thrown (should never happen in this method).", e);
            }
         }
         return bean;
      }

      public String toString() {
         return bean().toString();
      }

      public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
         return bean().toString(sb, prefix);
      }

      // required int64 collection_key = 1;
      public boolean hasCollectionKey() {
         return bean().hasCollectionKey();
      }

      public long getCollectionKey() {
         return bean().getCollectionKey();
      }

      // required bytes entry_key = 2;
      public boolean hasEntryKey() {
         return bean().hasEntryKey();
      }

      public org.fusesource.hawtbuf.Buffer getEntryKey() {
         return bean().getEntryKey();
      }

      public org.fusesource.hawtbuf.Buffer toUnframedBuffer() {
         if( buffer !=null ) {
            return buffer;
         }
         return org.fusesource.hawtbuf.proto.MessageBufferSupport.toUnframedBuffer(this);
      }

      public org.fusesource.hawtbuf.Buffer toFramedBuffer() {
         return org.fusesource.hawtbuf.proto.MessageBufferSupport.toFramedBuffer(this);
      }

      public byte[] toUnframedByteArray() {
         return toUnframedBuffer().toByteArray();
      }

      public byte[] toFramedByteArray() {
         return toFramedBuffer().toByteArray();
      }

      public void writeFramed(org.fusesource.hawtbuf.proto.CodedOutputStream output) throws java.io.IOException {
         output.writeRawVarint32(serializedSizeUnframed());
         writeUnframed(output);
      }

      public void writeFramed(java.io.OutputStream output) throws java.io.IOException {
         org.fusesource.hawtbuf.proto.CodedOutputStream codedOutput = new org.fusesource.hawtbuf.proto.CodedOutputStream(output);
         writeFramed(codedOutput);
         codedOutput.flush();
      }

      public void writeUnframed(java.io.OutputStream output) throws java.io.IOException {
         org.fusesource.hawtbuf.proto.CodedOutputStream codedOutput = new org.fusesource.hawtbuf.proto.CodedOutputStream(output);
         writeUnframed(codedOutput);
         codedOutput.flush();
      }

      public void writeUnframed(org.fusesource.hawtbuf.proto.CodedOutputStream output) throws java.io.IOException {
         if (buffer == null) {
            int size = serializedSizeUnframed();
            buffer = output.getNextBuffer(size);
            org.fusesource.hawtbuf.proto.CodedOutputStream original=null;
            if( buffer == null ) {
               buffer = new org.fusesource.hawtbuf.Buffer(new byte[size]);
               original = output;
               output = new org.fusesource.hawtbuf.proto.CodedOutputStream(buffer);
            }
            output.writeInt64(1, bean.getCollectionKey());
            output.writeBytes(2, bean.getEntryKey());
            if( original !=null ) {
               output.checkNoSpaceLeft();
               output = original;
               output.writeRawBytes(buffer);
            }
         } else {
            output.writeRawBytes(buffer);
         }
      }

      public int serializedSizeFramed() {
         int t = serializedSizeUnframed();
         return org.fusesource.hawtbuf.proto.CodedOutputStream.computeRawVarint32Size(t) + t;
      }

      public int serializedSizeUnframed() {
         if (buffer != null) {
            return buffer.length;
         }
         if (size != -1)
            return size;

         size = 0;
         size += org.fusesource.hawtbuf.proto.CodedOutputStream.computeInt64Size(1, getCollectionKey());
         size += org.fusesource.hawtbuf.proto.CodedOutputStream.computeBytesSize(2, getEntryKey());
         return size;
      }

      public boolean equals(Object obj) {
         if( obj==this )
            return true;
         
         if( obj==null || obj.getClass()!=Buffer.class )
            return false;
         
         return equals((Buffer)obj);
      }
      
      public boolean equals(Buffer obj) {
         return toUnframedBuffer().equals(obj.toUnframedBuffer());
      }
      
      public int hashCode() {
         if( hashCode==0 ) {
         hashCode=2000715872 ^ toUnframedBuffer().hashCode();
         }
         return hashCode;
      }
      
      public boolean frozen() {
         return true;
      }
   }

}
