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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEntity Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getNavigationPropertyBinding <em>Navigation Property Binding</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#isIncludeInServiceDocument <em>Include In Service Document</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEntitySet()
 * @model extendedMetaData="name='TEntitySet' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TEntitySet extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEntitySet_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Navigation Property Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property Binding</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEntitySet_NavigationPropertyBinding()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NavigationPropertyBinding' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TNavigationPropertyBinding> getNavigationPropertyBinding();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEntitySet_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' attribute.
	 * @see #setEntityType(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEntitySet_EntityType()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TQualifiedName" required="true"
	 *        extendedMetaData="kind='attribute' name='EntityType'"
	 * @generated
	 */
	String getEntityType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getEntityType <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' attribute.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(String value);

	/**
	 * Returns the value of the '<em><b>Include In Service Document</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include In Service Document</em>' attribute.
	 * @see #isSetIncludeInServiceDocument()
	 * @see #unsetIncludeInServiceDocument()
	 * @see #setIncludeInServiceDocument(boolean)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEntitySet_IncludeInServiceDocument()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IncludeInServiceDocument'"
	 * @generated
	 */
	boolean isIncludeInServiceDocument();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#isIncludeInServiceDocument <em>Include In Service Document</em>}' attribute.
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
	 * Unsets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#isIncludeInServiceDocument <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIncludeInServiceDocument()
	 * @see #isIncludeInServiceDocument()
	 * @see #setIncludeInServiceDocument(boolean)
	 * @generated
	 */
	void unsetIncludeInServiceDocument();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#isIncludeInServiceDocument <em>Include In Service Document</em>}' attribute is set.
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
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTEntitySet_Name()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TEntitySet
