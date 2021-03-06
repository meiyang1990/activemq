//
// Generated by protoc, do not edit by hand.
//
package org.apache.activemq.store.kahadb.data;


public enum KahaEntryType {

   KAHA_TRACE_COMMAND("KAHA_TRACE_COMMAND", 0),
   KAHA_ADD_MESSAGE_COMMAND("KAHA_ADD_MESSAGE_COMMAND", 1),
   KAHA_REMOVE_MESSAGE_COMMAND("KAHA_REMOVE_MESSAGE_COMMAND", 2),
   KAHA_PREPARE_COMMAND("KAHA_PREPARE_COMMAND", 3),
   KAHA_COMMIT_COMMAND("KAHA_COMMIT_COMMAND", 4),
   KAHA_ROLLBACK_COMMAND("KAHA_ROLLBACK_COMMAND", 5),
   KAHA_REMOVE_DESTINATION_COMMAND("KAHA_REMOVE_DESTINATION_COMMAND", 6),
   KAHA_SUBSCRIPTION_COMMAND("KAHA_SUBSCRIPTION_COMMAND", 7),
   KAHA_PRODUCER_AUDIT_COMMAND("KAHA_PRODUCER_AUDIT_COMMAND", 8),
   KAHA_ACK_MESSAGE_FILE_MAP_COMMAND("KAHA_ACK_MESSAGE_FILE_MAP_COMMAND", 9),
   KAHA_UPDATE_MESSAGE_COMMAND("KAHA_UPDATE_MESSAGE_COMMAND", 10),
   KAHA_ADD_SCHEDULED_JOB_COMMAND("KAHA_ADD_SCHEDULED_JOB_COMMAND", 11),
   KAHA_RESCHEDULE_JOB_COMMAND("KAHA_RESCHEDULE_JOB_COMMAND", 12),
   KAHA_REMOVE_SCHEDULED_JOB_COMMAND("KAHA_REMOVE_SCHEDULED_JOB_COMMAND", 13),
   KAHA_REMOVE_SCHEDULED_JOBS_COMMAND("KAHA_REMOVE_SCHEDULED_JOBS_COMMAND", 14),
   KAHA_DESTROY_SCHEDULER_COMMAND("KAHA_DESTROY_SCHEDULER_COMMAND", 15);

   private final String name;
   private final int value;

   private KahaEntryType(String name, int value) {
      this.name = name;
      this.value = value;
   }

   public final int getNumber() {
      return value;
   }

   public final String toString() {
      return name;
   }

   public static KahaEntryType valueOf(int value) {
      switch (value) {
      case 0:
         return KAHA_TRACE_COMMAND;
      case 1:
         return KAHA_ADD_MESSAGE_COMMAND;
      case 2:
         return KAHA_REMOVE_MESSAGE_COMMAND;
      case 3:
         return KAHA_PREPARE_COMMAND;
      case 4:
         return KAHA_COMMIT_COMMAND;
      case 5:
         return KAHA_ROLLBACK_COMMAND;
      case 6:
         return KAHA_REMOVE_DESTINATION_COMMAND;
      case 7:
         return KAHA_SUBSCRIPTION_COMMAND;
      case 8:
         return KAHA_PRODUCER_AUDIT_COMMAND;
      case 9:
         return KAHA_ACK_MESSAGE_FILE_MAP_COMMAND;
      case 10:
         return KAHA_UPDATE_MESSAGE_COMMAND;
      case 11:
         return KAHA_ADD_SCHEDULED_JOB_COMMAND;
      case 12:
         return KAHA_RESCHEDULE_JOB_COMMAND;
      case 13:
         return KAHA_REMOVE_SCHEDULED_JOB_COMMAND;
      case 14:
         return KAHA_REMOVE_SCHEDULED_JOBS_COMMAND;
      case 15:
         return KAHA_DESTROY_SCHEDULER_COMMAND;
      default:
         return null;
      }
   }

   public org.apache.activemq.protobuf.Message createMessage() {
      switch (this) {
         case KAHA_TRACE_COMMAND:
            return new KahaTraceCommand();
         case KAHA_ADD_MESSAGE_COMMAND:
            return new KahaAddMessageCommand();
         case KAHA_REMOVE_MESSAGE_COMMAND:
            return new KahaRemoveMessageCommand();
         case KAHA_PREPARE_COMMAND:
            return new KahaPrepareCommand();
         case KAHA_COMMIT_COMMAND:
            return new KahaCommitCommand();
         case KAHA_ROLLBACK_COMMAND:
            return new KahaRollbackCommand();
         case KAHA_REMOVE_DESTINATION_COMMAND:
            return new KahaRemoveDestinationCommand();
         case KAHA_SUBSCRIPTION_COMMAND:
            return new KahaSubscriptionCommand();
         case KAHA_PRODUCER_AUDIT_COMMAND:
            return new KahaProducerAuditCommand();
         case KAHA_ACK_MESSAGE_FILE_MAP_COMMAND:
            return new KahaAckMessageFileMapCommand();
         case KAHA_UPDATE_MESSAGE_COMMAND:
            return new KahaUpdateMessageCommand();
         case KAHA_ADD_SCHEDULED_JOB_COMMAND:
            return new KahaAddScheduledJobCommand();
         case KAHA_RESCHEDULE_JOB_COMMAND:
            return new KahaRescheduleJobCommand();
         case KAHA_REMOVE_SCHEDULED_JOB_COMMAND:
            return new KahaRemoveScheduledJobCommand();
         case KAHA_REMOVE_SCHEDULED_JOBS_COMMAND:
            return new KahaRemoveScheduledJobsCommand();
         case KAHA_DESTROY_SCHEDULER_COMMAND:
            return new KahaDestroySchedulerCommand();
         default:
            return null;
      }
   }

}

