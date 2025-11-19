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
 * A representation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getAction <em>Action</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getFunction <em>Function</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getTerm <em>Term</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getEntityContainer <em>Entity Container</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType()
 * @model extendedMetaData="name='Schema_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SchemaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TComplexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Type</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_ComplexType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ComplexType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TComplexType> getComplexType();

	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TEntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_EntityType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TEntityType> getEntityType();

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_TypeDefinition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TypeDefinition' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTypeDefinition> getTypeDefinition();

	/**
	 * Returns the value of the '<em><b>Enum Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_EnumType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnumType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TEnumType> getEnumType();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_Action()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TAction> getAction();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_Function()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TFunction> getFunction();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_Term()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Term' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TTerm> getTerm();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TAnnotations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_Annotations()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotations' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TAnnotations> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Entity Container</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.TEntityContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Container</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_EntityContainer()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityContainer' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TEntityContainer> getEntityContainer();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.odata.ns.edm.AnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AnnotationType> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_Alias()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TSimpleIdentifier"
	 *        extendedMetaData="kind='attribute' name='Alias'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getSchemaType_Namespace()
	 * @model dataType="org.open.oasis.docs.odata.ns.edm.TNamespaceName" required="true"
	 *        extendedMetaData="kind='attribute' name='Namespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

} // SchemaType
