package lk.ijse.dep.akashStainlessSteel.entity;

public class CustomJobEntity {
    private String jobId;
    private String customerId;
    private String name;
    private String description;

    public CustomJobEntity(String jobId, String customerId, String name, String description) {
        this.jobId = jobId;
        this.customerId = customerId;
        this.name = name;
        this.description = description;
    }

    public CustomJobEntity() {
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CustomJobEntity{" +
                "jobId='" + jobId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
