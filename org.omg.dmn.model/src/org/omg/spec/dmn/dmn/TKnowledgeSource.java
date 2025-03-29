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
package org.omg.spec.dmn.dmn;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TKnowledge Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getAuthorityRequirement <em>Authority Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getLocationURI <em>Location URI</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTKnowledgeSource()
 * @model extendedMetaData="name='tKnowledgeSource' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TKnowledgeSource extends TDRGElement {
	/**
	 * Returns the value of the '<em><b>Authority Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TAuthorityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority Requirement</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTKnowledgeSource_AuthorityRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorityRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TAuthorityRequirement> getAuthorityRequirement();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTKnowledgeSource_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(TDMNElementReference)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTKnowledgeSource_Owner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	TDMNElementReference getOwner();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(TDMNElementReference value);

	/**
	 * Returns the value of the '<em><b>Location URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location URI</em>' attribute.
	 * @see #setLocationURI(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTKnowledgeSource_LocationURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='locationURI'"
	 * @generated
	 */
	String getLocationURI();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getLocationURI <em>Location URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location URI</em>' attribute.
	 * @see #getLocationURI()
	 * @generated
	 */
	void setLocationURI(String value);

} // TKnowledgeSource
