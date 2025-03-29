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
package org.omg.spec.bpmn.bpmn;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDocumentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDocumentation#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDocumentation#getAny <em>Any</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDocumentation#getId <em>Id</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TDocumentation#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDocumentation()
 * @model extendedMetaData="name='tDocumentation' kind='mixed'"
 * @generated
 */
@ProviderType
public interface TDocumentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDocumentation_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDocumentation_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDocumentation_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDocumentation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Text Format</b></em>' attribute.
	 * The default value is <code>"text/plain"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Format</em>' attribute.
	 * @see #isSetTextFormat()
	 * @see #unsetTextFormat()
	 * @see #setTextFormat(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTDocumentation_TextFormat()
	 * @model default="text/plain" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='textFormat'"
	 * @generated
	 */
	String getTextFormat();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TDocumentation#getTextFormat <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Format</em>' attribute.
	 * @see #isSetTextFormat()
	 * @see #unsetTextFormat()
	 * @see #getTextFormat()
	 * @generated
	 */
	void setTextFormat(String value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TDocumentation#getTextFormat <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextFormat()
	 * @see #getTextFormat()
	 * @see #setTextFormat(String)
	 * @generated
	 */
	void unsetTextFormat();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TDocumentation#getTextFormat <em>Text Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Format</em>' attribute is set.
	 * @see #unsetTextFormat()
	 * @see #getTextFormat()
	 * @see #setTextFormat(String)
	 * @generated
	 */
	boolean isSetTextFormat();

} // TDocumentation
