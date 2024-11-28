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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QC Problem Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getAction <em>Action</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getError <em>Error</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getField <em>Field</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getId <em>Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getOccurrence <em>Occurrence</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQCProblemType()
 * @model extendedMetaData="name='QCProblemType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface QCProblemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQCProblemType_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	EList<Label> getLabel();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQCProblemType_Action()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='action'"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError
	 * @see #isSetError()
	 * @see #unsetError()
	 * @see #setError(QcProblemTypeError)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQCProblemType_Error()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='error'"
	 * @generated
	 */
	QcProblemTypeError getError();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeError
	 * @see #isSetError()
	 * @see #unsetError()
	 * @see #getError()
	 * @generated
	 */
	void setError(QcProblemTypeError value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetError()
	 * @see #getError()
	 * @see #setError(QcProblemTypeError)
	 * @generated
	 */
	void unsetError();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getError <em>Error</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Error</em>' attribute is set.
	 * @see #unsetError()
	 * @see #getError()
	 * @see #setError(QcProblemTypeError)
	 * @generated
	 */
	boolean isSetError();

	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField
	 * @see #isSetField()
	 * @see #unsetField()
	 * @see #setField(QcProblemTypeField)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQCProblemType_Field()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='field'"
	 * @generated
	 */
	QcProblemTypeField getField();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeField
	 * @see #isSetField()
	 * @see #unsetField()
	 * @see #getField()
	 * @generated
	 */
	void setField(QcProblemTypeField value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetField()
	 * @see #getField()
	 * @see #setField(QcProblemTypeField)
	 * @generated
	 */
	void unsetField();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getField <em>Field</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Field</em>' attribute is set.
	 * @see #unsetField()
	 * @see #getField()
	 * @see #setField(QcProblemTypeField)
	 * @generated
	 */
	boolean isSetField();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQCProblemType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence
	 * @see #isSetOccurrence()
	 * @see #unsetOccurrence()
	 * @see #setOccurrence(QcProblemTypeOccurrence)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getQCProblemType_Occurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='occurrence'"
	 * @generated
	 */
	QcProblemTypeOccurrence getOccurrence();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getOccurrence <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.QcProblemTypeOccurrence
	 * @see #isSetOccurrence()
	 * @see #unsetOccurrence()
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(QcProblemTypeOccurrence value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getOccurrence <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOccurrence()
	 * @see #getOccurrence()
	 * @see #setOccurrence(QcProblemTypeOccurrence)
	 * @generated
	 */
	void unsetOccurrence();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType#getOccurrence <em>Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Occurrence</em>' attribute is set.
	 * @see #unsetOccurrence()
	 * @see #getOccurrence()
	 * @see #setOccurrence(QcProblemTypeOccurrence)
	 * @generated
	 */
	boolean isSetOccurrence();

} // QCProblemType
