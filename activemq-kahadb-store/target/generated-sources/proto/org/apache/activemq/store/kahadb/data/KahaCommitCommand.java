//
// Generated by protoc, do not edit by hand.
//
package org.apache.activemq.store.kahadb.data;


public final class KahaCommitCommand extends KahaCommitCommandBase<KahaCommitCommand> implements org.apache.activemq.store.kahadb.JournalCommand<KahaCommitCommand> {

   public java.util.ArrayList<String> missingFields() {
      java.util.ArrayList<String> missingFields = super.missingFields();
      if(  !hasTransactionInfo() ) {
         missingFields.add("transaction_info");
      }
      if( hasTransactionInfo() ) {
         try {
            getTransactionInfo().assertInitialized();
         } catch (org.apache.activemq.protobuf.UninitializedMessageException e){
            missingFields.addAll(prefix(e.getMissingFields(),"transaction_info."));
         }
      }
      return missingFields;
   }

   public void clear() {
      super.clear();
      clearTransactionInfo();
   }

   public KahaCommitCommand clone() {
      return new KahaCommitCommand().mergeFrom(this);
   }

   public KahaCommitCommand mergeFrom(KahaCommitCommand other) {
      if (other.hasTransactionInfo()) {
         if (hasTransactionInfo()) {
            getTransactionInfo().mergeFrom(other.getTransactionInfo());
         } else {
            setTransactionInfo(other.getTransactionInfo().clone());
         }
      }
      return this;
   }

   public int serializedSizeUnframed() {
      if (memoizedSerializedSize != -1)
         return memoizedSerializedSize;

      int size = 0;
      if (hasTransactionInfo()) {
         size += computeMessageSize(1, getTransactionInfo());
      }
      memoizedSerializedSize = size;
      return size;
   }

   public KahaCommitCommand mergeUnframed(org.apache.activemq.protobuf.CodedInputStream input) throws java.io.IOException {
      while (true) {
         int tag = input.readTag();
         if ((tag & 0x07) == 4) {
            return this;
         }
         switch (tag) {
         case 0:
            return this;
         default: {
            break;
         }
         case 10:
            if (hasTransactionInfo()) {
               getTransactionInfo().mergeFramed(input);
            } else {
               setTransactionInfo(new KahaTransactionInfo().mergeFramed(input));
            }
            break;
         }
      }
   }
   public void writeUnframed(org.apache.activemq.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (hasTransactionInfo()) {
         writeMessage(output, 1, getTransactionInfo());
      }
   }

   public static KahaCommitCommand parseUnframed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaCommitCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaCommitCommand parseUnframed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaCommitCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaCommitCommand parseUnframed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaCommitCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaCommitCommand parseUnframed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaCommitCommand().mergeUnframed(data).checktInitialized();
   }

   public static KahaCommitCommand parseFramed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaCommitCommand().mergeFramed(data).checktInitialized();
   }

   public static KahaCommitCommand parseFramed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaCommitCommand().mergeFramed(data).checktInitialized();
   }

   public static KahaCommitCommand parseFramed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaCommitCommand().mergeFramed(data).checktInitialized();
   }

   public static KahaCommitCommand parseFramed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaCommitCommand().mergeFramed(data).checktInitialized();
   }

   public String toString() {
      return toString(new java.lang.StringBuilder(), "").toString();
   }

   public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
      if(  hasTransactionInfo() ) {
         sb.append(prefix+"transaction_info {\n");
         getTransactionInfo().toString(sb, prefix+"  ");
         sb.append(prefix+"}\n");
      }
      return sb;
   }

   public void visit(org.apache.activemq.store.kahadb.Visitor visitor) throws java.io.IOException {
      visitor.visit(this);
   }

   public KahaEntryType type() {
      return KahaEntryType.KAHA_COMMIT_COMMAND;
   }

   public boolean equals(Object obj) {
      if( obj==this )
         return true;
      
      if( obj==null || obj.getClass()!=KahaCommitCommand.class )
         return false;
      
      return equals((KahaCommitCommand)obj);
   }
   
   public boolean equals(KahaCommitCommand obj) {
      if (hasTransactionInfo() ^ obj.hasTransactionInfo() ) 
         return false;
      if (hasTransactionInfo() && ( !getTransactionInfo().equals(obj.getTransactionInfo()) ))
         return false;
      return true;
   }
   
   public int hashCode() {
      int rc=-651907739;
      if (hasTransactionInfo()) {
         rc ^= ( 265667724^getTransactionInfo().hashCode() );
      }
      return rc;
   }
   
}

abstract class KahaCommitCommandBase<T> extends org.apache.activemq.protobuf.BaseMessage<T> {

   // required KahaTransactionInfo transaction_info = 1;
   private KahaTransactionInfo f_transactionInfo = null;

   public boolean hasTransactionInfo() {
      return this.f_transactionInfo!=null;
   }

   public KahaTransactionInfo getTransactionInfo() {
      if( this.f_transactionInfo == null ) {
         this.f_transactionInfo = new KahaTransactionInfo();
      }
      return this.f_transactionInfo;
   }

   public T setTransactionInfo(KahaTransactionInfo transactionInfo) {
      loadAndClear();
      this.f_transactionInfo = transactionInfo;
      return (T)this;
   }

   public void clearTransactionInfo() {
      loadAndClear();
      this.f_transactionInfo = null;
   }

}

