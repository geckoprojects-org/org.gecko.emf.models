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
package org.open.oasis.docs.odata.ns.edmx;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TInclude Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getTermNamespace <em>Term Namespace</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTIncludeAnnotations()
 * @model extendedMetaData="name='TIncludeAnnotations' kind='empty'"
 * @generated
 */
@ProviderType
public interface TIncludeAnnotations extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' attribute.
	 * @see #setQualifier(String)
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTIncludeAnnotations_Qualifier()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier"
	 *        extendedMetaData="kind='attribute' name='Qualifier'"
	 * @generated
	 */
	String getQualifier();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getQualifier <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' attribute.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTIncludeAnnotations_TargetNamespace()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TNamespaceName"
	 *        extendedMetaData="kind='attribute' name='TargetNamespace'"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Term Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Namespace</em>' attribute.
	 * @see #setTermNamespace(String)
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#getTIncludeAnnotations_TermNamespace()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TNamespaceName" required="true"
	 *        extendedMetaData="kind='attribute' name='TermNamespace'"
	 * @generated
	 */
	String getTermNamespace();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getTermNamespace <em>Term Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Namespace</em>' attribute.
	 * @see #getTermNamespace()
	 * @generated
	 */
	void setTermNamespace(String value);

} // TIncludeAnnotations
