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
package org.omg.spec.cmmn.casemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCmmn Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tCmmnElement is the base type for ALL CMMN complex types except tExpression.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getExtensionElements <em>Extension Elements</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getId <em>Id</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCmmnElement()
 * @model abstract="true"
 *        extendedMetaData="name='tCmmnElement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCmmnElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TDocumentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCmmnElement_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDocumentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Elements</em>' containment reference.
	 * @see #setExtensionElements(TExtensionElements)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCmmnElement_ExtensionElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensionElements' namespace='##targetNamespace'"
	 * @generated
	 */
	TExtensionElements getExtensionElements();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getExtensionElements <em>Extension Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Elements</em>' containment reference.
	 * @see #getExtensionElements()
	 * @generated
	 */
	void setExtensionElements(TExtensionElements value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCmmnElement_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCmmnElement_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // TCmmnElement
