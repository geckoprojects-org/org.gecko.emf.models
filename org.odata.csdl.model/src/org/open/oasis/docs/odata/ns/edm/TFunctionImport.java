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
package org.open.oasis.docs.odata.ns.edm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFunction Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getEntitySet <em>Entity Set</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getFunction <em>Function</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#isIncludeInServiceDocument <em>Include In Service Document</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunctionImport()
 * @model extendedMetaData="name='TFunctionImport' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TFunctionImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunctionImport_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Entity Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Set</em>' attribute.
	 * @see #setEntitySet(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunctionImport_EntitySet()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TPath"
	 *        extendedMetaData="kind='attribute' name='EntitySet'"
	 * @generated
	 */
	String getEntitySet();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getEntitySet <em>Entity Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Set</em>' attribute.
	 * @see #getEntitySet()
	 * @generated
	 */
	void setEntitySet(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunctionImport_Function()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TQualifiedName" required="true"
	 *        extendedMetaData="kind='attribute' name='Function'"
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Include In Service Document</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include In Service Document</em>' attribute.
	 * @see #isSetIncludeInServiceDocument()
	 * @see #unsetIncludeInServiceDocument()
	 * @see #setIncludeInServiceDocument(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunctionImport_IncludeInServiceDocument()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IncludeInServiceDocument'"
	 * @generated
	 */
	boolean isIncludeInServiceDocument();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#isIncludeInServiceDocument <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include In Service Document</em>' attribute.
	 * @see #isSetIncludeInServiceDocument()
	 * @see #unsetIncludeInServiceDocument()
	 * @see #isIncludeInServiceDocument()
	 * @generated
	 */
	void setIncludeInServiceDocument(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#isIncludeInServiceDocument <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeInServiceDocument()
	 * @see #isIncludeInServiceDocument()
	 * @see #setIncludeInServiceDocument(boolean)
	 * @generated
	 */
	void unsetIncludeInServiceDocument();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#isIncludeInServiceDocument <em>Include In Service Document</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Include In Service Document</em>' attribute is set.
	 * @see #unsetIncludeInServiceDocument()
	 * @see #isIncludeInServiceDocument()
	 * @see #setIncludeInServiceDocument(boolean)
	 * @generated
	 */
	boolean isSetIncludeInServiceDocument();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTFunctionImport_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TFunctionImport
