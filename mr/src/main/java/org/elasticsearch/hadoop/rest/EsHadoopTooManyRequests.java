package org.elasticsearch.hadoop.rest;



public class EsHadoopTooManyRequests extends EsHadoopInvalidRequest {
	public EsHadoopTooManyRequests() {}

    public EsHadoopTooManyRequests(String message, Throwable cause) {
        super(message, cause);
    }

    public EsHadoopTooManyRequests(String message) {
        super(message);
    }

    public EsHadoopTooManyRequests(Throwable cause) {
        super(cause);
    }
}
