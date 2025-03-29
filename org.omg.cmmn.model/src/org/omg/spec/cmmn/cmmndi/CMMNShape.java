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
package org.omg.spec.cmmn.cmmndi;

import javax.xml.namespace.QName;

import org.omg.spec.cmmn.di.Shape;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMMN Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNShape#getCMMNLabel <em>CMMN Label</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNShape#getCmmnElementRef <em>Cmmn Element Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsCollapsed <em>Is Collapsed</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsPlanningTableCollapsed <em>Is Planning Table Collapsed</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNShape()
 * @model extendedMetaData="name='CMMNShape' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CMMNShape extends Shape {
	/**
	 * Returns the value of the '<em><b>CMMN Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CMMN Label</em>' containment reference.
	 * @see #setCMMNLabel(CMMNLabel)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNShape_CMMNLabel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CMMNLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	CMMNLabel getCMMNLabel();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#getCMMNLabel <em>CMMN Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMMN Label</em>' containment reference.
	 * @see #getCMMNLabel()
	 * @generated
	 */
	void setCMMNLabel(CMMNLabel value);

	/**
	 * Returns the value of the '<em><b>Cmmn Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmmn Element Ref</em>' attribute.
	 * @see #setCmmnElementRef(QName)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNShape_CmmnElementRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='cmmnElementRef'"
	 * @generated
	 */
	QName getCmmnElementRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#getCmmnElementRef <em>Cmmn Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmmn Element Ref</em>' attribute.
	 * @see #getCmmnElementRef()
	 * @generated
	 */
	void setCmmnElementRef(QName value);

	/**
	 * Returns the value of the '<em><b>Is Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collapsed</em>' attribute.
	 * @see #isSetIsCollapsed()
	 * @see #unsetIsCollapsed()
	 * @see #setIsCollapsed(boolean)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNShape_IsCollapsed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isCollapsed'"
	 * @generated
	 */
	boolean isIsCollapsed();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsCollapsed <em>Is Collapsed</em>}' attribute.
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
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsCollapsed <em>Is Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCollapsed()
	 * @see #isIsCollapsed()
	 * @see #setIsCollapsed(boolean)
	 * @generated
	 */
	void unsetIsCollapsed();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsCollapsed <em>Is Collapsed</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Is Planning Table Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Planning Table Collapsed</em>' attribute.
	 * @see #isSetIsPlanningTableCollapsed()
	 * @see #unsetIsPlanningTableCollapsed()
	 * @see #setIsPlanningTableCollapsed(boolean)
	 * @see org.omg.spec.cmmn.cmmndi.CMMNDIPackage#getCMMNShape_IsPlanningTableCollapsed()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isPlanningTableCollapsed'"
	 * @generated
	 */
	boolean isIsPlanningTableCollapsed();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsPlanningTableCollapsed <em>Is Planning Table Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Planning Table Collapsed</em>' attribute.
	 * @see #isSetIsPlanningTableCollapsed()
	 * @see #unsetIsPlanningTableCollapsed()
	 * @see #isIsPlanningTableCollapsed()
	 * @generated
	 */
	void setIsPlanningTableCollapsed(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsPlanningTableCollapsed <em>Is Planning Table Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPlanningTableCollapsed()
	 * @see #isIsPlanningTableCollapsed()
	 * @see #setIsPlanningTableCollapsed(boolean)
	 * @generated
	 */
	void unsetIsPlanningTableCollapsed();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.cmmndi.CMMNShape#isIsPlanningTableCollapsed <em>Is Planning Table Collapsed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Planning Table Collapsed</em>' attribute is set.
	 * @see #unsetIsPlanningTableCollapsed()
	 * @see #isIsPlanningTableCollapsed()
	 * @see #setIsPlanningTableCollapsed(boolean)
	 * @generated
	 */
	boolean isSetIsPlanningTableCollapsed();

} // CMMNShape
