/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.dmn.dmndi;

import javax.xml.namespace.QName;

import org.omg.spec.dmn.di.Shape;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMN Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNShape#getDMNLabel <em>DMN Label</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNShape#getDMNDecisionServiceDividerLine <em>DMN Decision Service Divider Line</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNShape#getDmnElementRef <em>Dmn Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNShape#isIsCollapsed <em>Is Collapsed</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmndi.DMNShape#isIsListedInputData <em>Is Listed Input Data</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNShape()
 * @model extendedMetaData="name='DMNShape' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DMNShape extends Shape {
	/**
	 * Returns the value of the '<em><b>DMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Label</em>' containment reference.
	 * @see #setDMNLabel(DMNLabel)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNShape_DMNLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DMNLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	DMNLabel getDMNLabel();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNShape#getDMNLabel <em>DMN Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Label</em>' containment reference.
	 * @see #getDMNLabel()
	 * @generated
	 */
	void setDMNLabel(DMNLabel value);

	/**
	 * Returns the value of the '<em><b>DMN Decision Service Divider Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Decision Service Divider Line</em>' containment reference.
	 * @see #setDMNDecisionServiceDividerLine(DMNDecisionServiceDividerLine)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNShape_DMNDecisionServiceDividerLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DMNDecisionServiceDividerLine' namespace='##targetNamespace'"
	 * @generated
	 */
	DMNDecisionServiceDividerLine getDMNDecisionServiceDividerLine();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNShape#getDMNDecisionServiceDividerLine <em>DMN Decision Service Divider Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMN Decision Service Divider Line</em>' containment reference.
	 * @see #getDMNDecisionServiceDividerLine()
	 * @generated
	 */
	void setDMNDecisionServiceDividerLine(DMNDecisionServiceDividerLine value);

	/**
	 * Returns the value of the '<em><b>Dmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmn Element Ref</em>' attribute.
	 * @see #setDmnElementRef(QName)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNShape_DmnElementRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='dmnElementRef'"
	 * @generated
	 */
	QName getDmnElementRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNShape#getDmnElementRef <em>Dmn Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmn Element Ref</em>' attribute.
	 * @see #getDmnElementRef()
	 * @generated
	 */
	void setDmnElementRef(QName value);

	/**
	 * Returns the value of the '<em><b>Is Collapsed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collapsed</em>' attribute.
	 * @see #isSetIsCollapsed()
	 * @see #unsetIsCollapsed()
	 * @see #setIsCollapsed(boolean)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNShape_IsCollapsed()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isCollapsed'"
	 * @generated
	 */
	boolean isIsCollapsed();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNShape#isIsCollapsed <em>Is Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collapsed</em>' attribute.
	 * @see #isSetIsCollapsed()
	 * @see #unsetIsCollapsed()
	 * @see #isIsCollapsed()
	 * @generated
	 */
	void setIsCollapsed(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmndi.DMNShape#isIsCollapsed <em>Is Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCollapsed()
	 * @see #isIsCollapsed()
	 * @see #setIsCollapsed(boolean)
	 * @generated
	 */
	void unsetIsCollapsed();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmndi.DMNShape#isIsCollapsed <em>Is Collapsed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Collapsed</em>' attribute is set.
	 * @see #unsetIsCollapsed()
	 * @see #isIsCollapsed()
	 * @see #setIsCollapsed(boolean)
	 * @generated
	 */
	boolean isSetIsCollapsed();

	/**
	 * Returns the value of the '<em><b>Is Listed Input Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Listed Input Data</em>' attribute.
	 * @see #isSetIsListedInputData()
	 * @see #unsetIsListedInputData()
	 * @see #setIsListedInputData(boolean)
	 * @see org.omg.spec.dmn.dmndi.DMNDIPackage#getDMNShape_IsListedInputData()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isListedInputData'"
	 * @generated
	 */
	boolean isIsListedInputData();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmndi.DMNShape#isIsListedInputData <em>Is Listed Input Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Listed Input Data</em>' attribute.
	 * @see #isSetIsListedInputData()
	 * @see #unsetIsListedInputData()
	 * @see #isIsListedInputData()
	 * @generated
	 */
	void setIsListedInputData(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmndi.DMNShape#isIsListedInputData <em>Is Listed Input Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsListedInputData()
	 * @see #isIsListedInputData()
	 * @see #setIsListedInputData(boolean)
	 * @generated
	 */
	void unsetIsListedInputData();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmndi.DMNShape#isIsListedInputData <em>Is Listed Input Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Listed Input Data</em>' attribute is set.
	 * @see #unsetIsListedInputData()
	 * @see #isIsListedInputData()
	 * @see #setIsListedInputData(boolean)
	 * @generated
	 */
	boolean isSetIsListedInputData();

} // DMNShape
