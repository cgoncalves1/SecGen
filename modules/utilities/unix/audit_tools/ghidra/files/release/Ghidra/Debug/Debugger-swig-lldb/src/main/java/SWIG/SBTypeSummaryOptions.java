/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package SWIG;

public class SBTypeSummaryOptions {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SBTypeSummaryOptions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SBTypeSummaryOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SBTypeSummaryOptions obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lldbJNI.delete_SBTypeSummaryOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SBTypeSummaryOptions() {
    this(lldbJNI.new_SBTypeSummaryOptions__SWIG_0(), true);
  }

  public SBTypeSummaryOptions(SBTypeSummaryOptions rhs) {
    this(lldbJNI.new_SBTypeSummaryOptions__SWIG_1(SBTypeSummaryOptions.getCPtr(rhs), rhs), true);
  }

  public boolean IsValid() {
    return lldbJNI.SBTypeSummaryOptions_IsValid(swigCPtr, this);
  }

  public LanguageType GetLanguage() {
    return LanguageType.swigToEnum(lldbJNI.SBTypeSummaryOptions_GetLanguage(swigCPtr, this));
  }

  public TypeSummaryCapping GetCapping() {
    return TypeSummaryCapping.swigToEnum(lldbJNI.SBTypeSummaryOptions_GetCapping(swigCPtr, this));
  }

  public void SetLanguage(LanguageType arg0) {
    lldbJNI.SBTypeSummaryOptions_SetLanguage(swigCPtr, this, arg0.swigValue());
  }

  public void SetCapping(TypeSummaryCapping arg0) {
    lldbJNI.SBTypeSummaryOptions_SetCapping(swigCPtr, this, arg0.swigValue());
  }

}