package ETL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Components {

    private Double storage_C_GB;
    private Double storage_C_percent;
    private Double cpu_percent;
    private Double ram_DDR4_GB;
    private Double ram_DDR4_percent;

    // Getters e setters
    public Double getStorage_C_GB() {
        return storage_C_GB;
    }

    public void setStorage_C_GB(Double storage_C_GB) {
        this.storage_C_GB = storage_C_GB;
    }

    public Double getStorage_C_percent() {
        return storage_C_percent;
    }

    public void setStorage_C_percent(Double storage_C_percent) {
        this.storage_C_percent = storage_C_percent;
    }

    public Double getCpu_percent() {
        return cpu_percent;
    }

    public void setCpu_percent(Double cpu_percent) {
        this.cpu_percent = cpu_percent;
    }

    public Double getRam_DDR4_GB() {
        return ram_DDR4_GB;
    }

    public void setRam_DDR4_GB(Double ram_DDR4_GB) {
        this.ram_DDR4_GB = ram_DDR4_GB;
    }

    public Double getRam_DDR4_percent() {
        return ram_DDR4_percent;
    }

    public void setRam_DDR4_percent(Double ram_DDR4_percent) {
        this.ram_DDR4_percent = ram_DDR4_percent;
    }
}
