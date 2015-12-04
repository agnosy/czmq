/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include "czmq.h"
#include "../../native/include/org_zeromq_czmq_Zloop.h"

JNIEXPORT jlong JNICALL
Java_org_zeromq_czmq_Zloop__1_1new (JNIEnv *env, jclass c)
{
    jlong new_ = (jlong) zloop_new ();
    return new_;
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1destroy (JNIEnv *env, jclass c, jlong self_p)
{
    zloop_destroy ((zloop_t **) &self_p);
}

JNIEXPORT jint JNICALL
Java_org_zeromq_czmq_Zloop__1_1reader (JNIEnv *env, jclass c, jlong self, jlong sock, jlong handler, jlong arg)
{
    jint reader_ = (jint) zloop_reader ((zloop_t *) self, (zsock_t *) sock, (zloop_reader_fn *) handler, (void *) arg);
    return reader_;
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1readerEnd (JNIEnv *env, jclass c, jlong self, jlong sock)
{
    zloop_reader_end ((zloop_t *) self, (zsock_t *) sock);
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1readerSetTolerant (JNIEnv *env, jclass c, jlong self, jlong sock)
{
    zloop_reader_set_tolerant ((zloop_t *) self, (zsock_t *) sock);
}

JNIEXPORT jint JNICALL
Java_org_zeromq_czmq_Zloop__1_1timer (JNIEnv *env, jclass c, jlong self, jlong delay, jlong times, jlong handler, jlong arg)
{
    jint timer_ = (jint) zloop_timer ((zloop_t *) self, (size_t) delay, (size_t) times, (zloop_timer_fn *) handler, (void *) arg);
    return timer_;
}

JNIEXPORT jint JNICALL
Java_org_zeromq_czmq_Zloop__1_1timerEnd (JNIEnv *env, jclass c, jlong self, jint timer_id)
{
    jint timer_end_ = (jint) zloop_timer_end ((zloop_t *) self, (int) timer_id);
    return timer_end_;
}

JNIEXPORT jlong JNICALL
Java_org_zeromq_czmq_Zloop__1_1ticket (JNIEnv *env, jclass c, jlong self, jlong handler, jlong arg)
{
    jlong ticket_ = (jlong) zloop_ticket ((zloop_t *) self, (zloop_timer_fn *) handler, (void *) arg);
    return ticket_;
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1ticketReset (JNIEnv *env, jclass c, jlong self, jlong handle)
{
    zloop_ticket_reset ((zloop_t *) self, (void *) handle);
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1ticketDelete (JNIEnv *env, jclass c, jlong self, jlong handle)
{
    zloop_ticket_delete ((zloop_t *) self, (void *) handle);
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1setTicketDelay (JNIEnv *env, jclass c, jlong self, jlong ticket_delay)
{
    zloop_set_ticket_delay ((zloop_t *) self, (size_t) ticket_delay);
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1setMaxTimers (JNIEnv *env, jclass c, jlong self, jlong max_timers)
{
    zloop_set_max_timers ((zloop_t *) self, (size_t) max_timers);
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1setVerbose (JNIEnv *env, jclass c, jlong self, jboolean verbose)
{
    zloop_set_verbose ((zloop_t *) self, (bool) verbose);
}

JNIEXPORT jint JNICALL
Java_org_zeromq_czmq_Zloop__1_1start (JNIEnv *env, jclass c, jlong self)
{
    jint start_ = (jint) zloop_start ((zloop_t *) self);
    return start_;
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1ignoreInterrupts (JNIEnv *env, jclass c, jlong self)
{
    zloop_ignore_interrupts ((zloop_t *) self);
}

JNIEXPORT void JNICALL
Java_org_zeromq_czmq_Zloop__1_1test (JNIEnv *env, jclass c, jboolean verbose)
{
    zloop_test ((bool) verbose);
}

