//
// Generated by protoc, do not edit by hand.
//
package org.apache.activemq.store.kahadb.data;


public final class KahaTransactionInfo extends KahaTransactionInfoBase<KahaTransactionInfo> {

   public java.util.ArrayList<String> missingFields() {
      java.util.ArrayList<String> missingFields = super.missingFields();
      if( hasLocalTransactionId() ) {
         try {
            getLocalTransactionId().assertInitialized();
         } catch (org.apache.activemq.protobuf.UninitializedMessageException e){
            missingFields.addAll(prefix(e.getMissingFields(),"local_transaction_id."));
         }
      }
      if( hasXaTransactionId() ) {
         try {
            getXaTransactionId().assertInitialized();
         } catch (org.apache.activemq.protobuf.UninitializedMessageException e){
            missingFields.addAll(prefix(e.getMissingFields(),"xa_transaction_id."));
         }
      }
      if( hasPreviousEntry() ) {
         try {
            getPreviousEntry().assertInitialized();
         } catch (org.apache.activemq.protobuf.UninitializedMessageException e){
            missingFields.addAll(prefix(e.getMissingFields(),"previous_entry."));
         }
      }
      return missingFields;
   }

   public void clear() {
      super.clear();
      clearLocalTransactionId();
      clearXaTransactionId();
      clearPreviousEntry();
   }

   public KahaTransactionInfo clone() {
      return new KahaTransactionInfo().mergeFrom(this);
   }

   public KahaTransactionInfo mergeFrom(KahaTransactionInfo other) {
      if (other.hasLocalTransactionId()) {
         if (hasLocalTransactionId()) {
            getLocalTransactionId().mergeFrom(other.getLocalTransactionId());
         } else {
            setLocalTransactionId(other.getLocalTransactionId().clone());
         }
      }
      if (other.hasXaTransactionId()) {
         if (hasXaTransactionId()) {
            getXaTransactionId().mergeFrom(other.getXaTransactionId());
         } else {
            setXaTransactionId(other.getXaTransactionId().clone());
         }
      }
      if (other.hasPreviousEntry()) {
         if (hasPreviousEntry()) {
            getPreviousEntry().mergeFrom(other.getPreviousEntry());
         } else {
            setPreviousEntry(other.getPreviousEntry().clone());
         }
      }
      return this;
   }

   public int serializedSizeUnframed() {
      if (memoizedSerializedSize != -1)
         return memoizedSerializedSize;

      int size = 0;
      if (hasLocalTransactionId()) {
         size += computeMessageSize(1, getLocalTransactionId());
      }
      if (hasXaTransactionId()) {
         size += computeMessageSize(2, getXaTransactionId());
      }
      if (hasPreviousEntry()) {
         size += computeMessageSize(3, getPreviousEntry());
      }
      memoizedSerializedSize = size;
      return size;
   }

   public KahaTransactionInfo mergeUnframed(org.apache.activemq.protobuf.CodedInputStream input) throws java.io.IOException {
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
            if (hasLocalTransactionId()) {
               getLocalTransactionId().mergeFramed(input);
            } else {
               setLocalTransactionId(new KahaLocalTransactionId().mergeFramed(input));
            }
            break;
         case 18:
            if (hasXaTransactionId()) {
               getXaTransactionId().mergeFramed(input);
            } else {
               setXaTransactionId(new KahaXATransactionId().mergeFramed(input));
            }
            break;
         case 26:
            if (hasPreviousEntry()) {
               getPreviousEntry().mergeFramed(input);
            } else {
               setPreviousEntry(new KahaLocation().mergeFramed(input));
            }
            break;
         }
      }
   }
   public void writeUnframed(org.apache.activemq.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (hasLocalTransactionId()) {
         writeMessage(output, 1, getLocalTransactionId());
      }
      if (hasXaTransactionId()) {
         writeMessage(output, 2, getXaTransactionId());
      }
      if (hasPreviousEntry()) {
         writeMessage(output, 3, getPreviousEntry());
      }
   }

   public static KahaTransactionInfo parseUnframed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaTransactionInfo().mergeUnframed(data).checktInitialized();
   }

   public static KahaTransactionInfo parseUnframed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaTransactionInfo().mergeUnframed(data).checktInitialized();
   }

   public static KahaTransactionInfo parseUnframed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaTransactionInfo().mergeUnframed(data).checktInitialized();
   }

   public static KahaTransactionInfo parseUnframed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaTransactionInfo().mergeUnframed(data).checktInitialized();
   }

   public static KahaTransactionInfo parseFramed(org.apache.activemq.protobuf.CodedInputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaTransactionInfo().mergeFramed(data).checktInitialized();
   }

   public static KahaTransactionInfo parseFramed(org.apache.activemq.protobuf.Buffer data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaTransactionInfo().mergeFramed(data).checktInitialized();
   }

   public static KahaTransactionInfo parseFramed(byte[] data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException {
      return new KahaTransactionInfo().mergeFramed(data).checktInitialized();
   }

   public static KahaTransactionInfo parseFramed(java.io.InputStream data) throws org.apache.activemq.protobuf.InvalidProtocolBufferException, java.io.IOException {
      return new KahaTransactionInfo().mergeFramed(data).checktInitialized();
   }

   public String toString() {
      return toString(new java.lang.StringBuilder(), "").toString();
   }

   public java.lang.StringBuilder toString(java.lang.StringBuilder sb, String prefix) {
      if(  hasLocalTransactionId() ) {
         sb.append(prefix+"local_transaction_id {\n");
         getLocalTransactionId().toString(sb, prefix+"  ");
         sb.append(prefix+"}\n");
      }
      if(  hasXaTransactionId() ) {
         sb.append(prefix+"xa_transaction_id {\n");
         getXaTransactionId().toString(sb, prefix+"  ");
         sb.append(prefix+"}\n");
      }
      if(  hasPreviousEntry() ) {
         sb.append(prefix+"previous_entry {\n");
         getPreviousEntry().toString(sb, prefix+"  ");
         sb.append(prefix+"}\n");
      }
      return sb;
   }

   public boolean equals(Object obj) {
      if( obj==this )
         return true;
      
      if( obj==null || obj.getClass()!=KahaTransactionInfo.class )
         return false;
      
      return equals((KahaTransactionInfo)obj);
   }
   
   public boolean equals(KahaTransactionInfo obj) {
      if (hasLocalTransactionId() ^ obj.hasLocalTransactionId() ) 
         return false;
      if (hasLocalTransactionId() && ( !getLocalTransactionId().equals(obj.getLocalTransactionId()) ))
         return false;
      if (hasXaTransactionId() ^ obj.hasXaTransactionId() ) 
         return false;
      if (hasXaTransactionId() && ( !getXaTransactionId().equals(obj.getXaTransactionId()) ))
         return false;
      if (hasPreviousEntry() ^ obj.hasPreviousEntry() ) 
         return false;
      if (hasPreviousEntry() && ( !getPreviousEntry().equals(obj.getPreviousEntry()) ))
         return false;
      return true;
   }
   
   public int hashCode() {
      int rc=156129213;
      if (hasLocalTransactionId()) {
         rc ^= ( 812273422^getLocalTransactionId().hashCode() );
      }
      if (hasXaTransactionId()) {
         rc ^= ( -1026770928^getXaTransactionId().hashCode() );
      }
      if (hasPreviousEntry()) {
         rc ^= ( 508350363^getPreviousEntry().hashCode() );
      }
      return rc;
   }
   
}

abstract class KahaTransactionInfoBase<T> extends org.apache.activemq.protobuf.BaseMessage<T> {

   // optional KahaLocalTransactionId local_transaction_id = 1;
   private KahaLocalTransactionId f_localTransactionId = null;

   public boolean hasLocalTransactionId() {
      return this.f_localTransactionId!=null;
   }

   public KahaLocalTransactionId getLocalTransactionId() {
      if( this.f_localTransactionId == null ) {
         this.f_localTransactionId = new KahaLocalTransactionId();
      }
      return this.f_localTransactionId;
   }

   public T setLocalTransactionId(KahaLocalTransactionId localTransactionId) {
      loadAndClear();
      this.f_localTransactionId = localTransactionId;
      return (T)this;
   }

   public void clearLocalTransactionId() {
      loadAndClear();
      this.f_localTransactionId = null;
   }

   // optional KahaXATransactionId xa_transaction_id = 2;
   private KahaXATransactionId f_xaTransactionId = null;

   public boolean hasXaTransactionId() {
      return this.f_xaTransactionId!=null;
   }

   public KahaXATransactionId getXaTransactionId() {
      if( this.f_xaTransactionId == null ) {
         this.f_xaTransactionId = new KahaXATransactionId();
      }
      return this.f_xaTransactionId;
   }

   public T setXaTransactionId(KahaXATransactionId xaTransactionId) {
      loadAndClear();
      this.f_xaTransactionId = xaTransactionId;
      return (T)this;
   }

   public void clearXaTransactionId() {
      loadAndClear();
      this.f_xaTransactionId = null;
   }

   // optional KahaLocation previous_entry = 3;
   private KahaLocation f_previousEntry = null;

   public boolean hasPreviousEntry() {
      return this.f_previousEntry!=null;
   }

   public KahaLocation getPreviousEntry() {
      if( this.f_previousEntry == null ) {
         this.f_previousEntry = new KahaLocation();
      }
      return this.f_previousEntry;
   }

   public T setPreviousEntry(KahaLocation previousEntry) {
      loadAndClear();
      this.f_previousEntry = previousEntry;
      return (T)this;
   }

   public void clearPreviousEntry() {
      loadAndClear();
      this.f_previousEntry = null;
   }

}

