/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.emau.icmvc.ganimed.ttp.cm2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qc Problem DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCommentExtern <em>Comment Extern</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCommentIntern <em>Comment Intern</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getFormValue <em>Form Value</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getRef <em>Ref</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getScanValue <em>Scan Value</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getStatus <em>Status</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getUpdatedAt <em>Updated At</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemDTO()
 * @model extendedMetaData="name='qcProblemDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface QcProblemDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Comment Extern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Extern</em>' attribute.
	 * @see #setCommentExtern(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemDTO_CommentExtern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='commentExtern'"
	 * @generated
	 */
	String getCommentExtern();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCommentExtern <em>Comment Extern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Extern</em>' attribute.
	 * @see #getCommentExtern()
	 * @generated
	 */
	void setCommentExtern(String value);

	/**
	 * Returns the value of the '<em><b>Comment Intern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Intern</em>' attribute.
	 * @see #setCommentIntern(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemDTO_CommentIntern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='commentIntern'"
	 * @generated
	 */
	String getCommentIntern();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCommentIntern <em>Comment Intern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Intern</em>' attribute.
	 * @see #getCommentIntern()
	 * @generated
	 */
	void setCommentIntern(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemDTO_CreatedAt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='createdAt'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedAt();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Form Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Value</em>' attribute.
	 * @see #setFormValue(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemDTO_FormValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='formValue'"
	 * @generated
	 */
	String getFormValue();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getFormValue <em>Form Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Value</em>' attribute.
	 * @see #getFormValue()
	 * @generated
	 */
	void setFormValue(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemDTO_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Scan Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan Value</em>' attribute.
	 * @see #setScanValue(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemDTO_ScanValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='scanValue'"
	 * @generated
	 */
	String getScanValue();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getScanValue <em>Scan Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Value</em>' attribute.
	 * @see #getScanValue()
	 * @generated
	 */
	void setScanValue(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(QcProblemStatus)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemDTO_Status()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='status'"
	 * @generated
	 */
	QcProblemStatus getStatus();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(QcProblemStatus value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(QcProblemStatus)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(QcProblemStatus)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQcProblemDTO_UpdatedAt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='updatedAt'"
	 * @generated
	 */
	XMLGregorianCalendar getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(XMLGregorianCalendar value);

} // QcProblemDTO
