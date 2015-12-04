/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
package org.zeromq.czmq;

public class Zconfig implements AutoCloseable{
    static {
        try {
            System.loadLibrary ("czmqjni");
        }
        catch (Exception e) {
            System.exit (-1);
        }
    }
    long self;
    /*
    Create new config item
    */
    native static long __new (String name, long parent);
    public Zconfig (String name, long parent) {
        /*  TODO: if __new fails, self is null...  */
        self = __new (name, parent);
    }
    public Zconfig () {
        self = 0;
    }
    /*
    Destroy a config item and all its children
    */
    native static void __destroy (long self);
    @Override
    public void close () {
        __destroy (self);
        self = 0;
    }
    /*
    Return name of config item
    */
    native static String __name (long self);
    public String name (long self) {
        return __name (self);
    }
    /*
    Return value of config item
    */
    native static String __value (long self);
    public String value (long self) {
        return __value (self);
    }
    /*
    Insert or update configuration key with value
    */
    native static void __put (long self, String path, String value);
    public void put (long self, String path, String value) {
        __put (self, path, value);
    }
    /*
    Equivalent to zconfig_put, accepting a format specifier and variable
    argument list, instead of a single string value.                    
    */
    native static void __putf (long self, String path, String format);
    public void putf (long self, String path, String format) {
        __putf (self, path, format);
    }
    /*
    Get value for config item into a string value; leading slash is optional
    and ignored.                                                            
    */
    native static String __get (long self, String path, String defaultValue);
    public String get (long self, String path, String defaultValue) {
        return __get (self, path, defaultValue);
    }
    /*
    Set config item name, name may be NULL
    */
    native static void __setName (long self, String name);
    public void setName (long self, String name) {
        __setName (self, name);
    }
    /*
    Set new value for config item. The new value may be a string, a printf  
    format, or NULL. Note that if string may possibly contain '%', or if it 
    comes from an insecure source, you must use '%s' as the format, followed
    by the string.                                                          
    */
    native static void __setValue (long self, String format);
    public void setValue (long self, String format) {
        __setValue (self, format);
    }
    /*
    Find our first child, if any
    */
    native static long __child (long self);
    public long child (long self) {
        return __child (self);
    }
    /*
    Find our first sibling, if any
    */
    native static long __next (long self);
    public long next (long self) {
        return __next (self);
    }
    /*
    Find a config item along a path; leading slash is optional and ignored.
    */
    native static long __locate (long self, String path);
    public long locate (long self, String path) {
        return __locate (self, path);
    }
    /*
    Locate the last config item at a specified depth
    */
    native static long __atDepth (long self, int level);
    public long atDepth (long self, int level) {
        return __atDepth (self, level);
    }
    /*
    Execute a callback for each config item in the tree; returns zero if
    successful, else -1.                                                
    */
    native static int __execute (long self, long handler, long arg);
    public int execute (long self, long handler, long arg) {
        return __execute (self, handler, arg);
    }
    /*
    Add comment to config item before saving to disk. You can add as many
    comment lines as you like. If you use a null format, all comments are
    deleted.                                                             
    */
    native static void __setComment (long self, String format);
    public void setComment (long self, String format) {
        __setComment (self, format);
    }
    /*
    Return comments of config item, as zlist.
    */
    native static long __comments (long self);
    public long comments (long self) {
        return __comments (self);
    }
    /*
    Load a config tree from a specified ZPL text file; returns a zconfig_t  
    reference for the root, if the file exists and is readable. Returns NULL
    if the file does not exist.                                             
    */
    native static long __load (String filename);
    public long load (String filename) {
        return __load (filename);
    }
    /*
    Save a config tree to a specified ZPL text file, where a filename
    "-" means dump to standard output.                               
    */
    native static int __save (long self, String filename);
    public int save (long self, String filename) {
        return __save (self, filename);
    }
    /*
    Equivalent to zconfig_load, taking a format string instead of a fixed
    filename.                                                            
    */
    native static long __loadf (String format);
    public long loadf (String format) {
        return __loadf (format);
    }
    /*
    Equivalent to zconfig_save, taking a format string instead of a fixed
    filename.                                                            
    */
    native static int __savef (long self, String format);
    public int savef (long self, String format) {
        return __savef (self, format);
    }
    /*
    Report filename used during zconfig_load, or NULL if none
    */
    native static String __filename (long self);
    public String filename (long self) {
        return __filename (self);
    }
    /*
    Reload config tree from same file that it was previously loaded from.
    Returns 0 if OK, -1 if there was an error (and then does not change  
    existing data).                                                      
    */
    native static int __reload (long selfP);
    public int reload (long selfP) {
        return __reload (selfP);
    }
    /*
    Load a config tree from a memory chunk
    */
    native static long __chunkLoad (long chunk);
    public long chunkLoad (long chunk) {
        return __chunkLoad (chunk);
    }
    /*
    Save a config tree to a new memory chunk
    */
    native static long __chunkSave (long self);
    public long chunkSave (long self) {
        return __chunkSave (self);
    }
    /*
    Load a config tree from a null-terminated string
    */
    native static long __strLoad (String string);
    public long strLoad (String string) {
        return __strLoad (string);
    }
    /*
    Save a config tree to a new null terminated string
    */
    native static String __strSave (long self);
    public String strSave (long self) {
        return __strSave (self);
    }
    /*
    Return true if a configuration tree was loaded from a file and that
    file has changed in since the tree was loaded.                     
    */
    native static boolean __hasChanged (long self);
    public boolean hasChanged (long self) {
        return __hasChanged (self);
    }
    /*
    Print properties of object
    */
    native static void __print (long self);
    public void print (long self) {
        __print (self);
    }
    /*
    Self test of this class
    */
    native static void __test (boolean verbose);
    public void test (boolean verbose) {
        __test (verbose);
    }
}
