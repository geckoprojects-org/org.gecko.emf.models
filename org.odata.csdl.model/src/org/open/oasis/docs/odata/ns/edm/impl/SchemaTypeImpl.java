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
package org.open.oasis.docs.odata.ns.edm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.odata.ns.edm.AnnotationType;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;
import org.open.oasis.docs.odata.ns.edm.SchemaType;
import org.open.oasis.docs.odata.ns.edm.TAction;
import org.open.oasis.docs.odata.ns.edm.TAnnotations;
import org.open.oasis.docs.odata.ns.edm.TComplexType;
import org.open.oasis.docs.odata.ns.edm.TEntityContainer;
import org.open.oasis.docs.odata.ns.edm.TEntityType;
import org.open.oasis.docs.odata.ns.edm.TEnumType;
import org.open.oasis.docs.odata.ns.edm.TFunction;
import org.open.oasis.docs.odata.ns.edm.TTerm;
import org.open.oasis.docs.odata.ns.edm.TTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getEntityContainer <em>Entity Container</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaTypeImpl extends MinimalEObjectImpl.Container implements SchemaType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getSchemaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.SCHEMA_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TComplexType> getComplexType() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_ComplexType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TEntityType> getEntityType() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_EntityType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTypeDefinition> getTypeDefinition() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_TypeDefinition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TEnumType> getEnumType() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_EnumType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAction> getAction() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_Action());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFunction> getFunction() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_Function());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TTerm> getTerm() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_Term());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAnnotations> getAnnotations() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_Annotations());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TEntityContainer> getEntityContainer() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_EntityContainer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmPackage.eINSTANCE.getSchemaType_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.SCHEMA_TYPE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.SCHEMA_TYPE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.SCHEMA_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__COMPLEX_TYPE:
				return ((InternalEList<?>)getComplexType()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__ENTITY_TYPE:
				return ((InternalEList<?>)getEntityType()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__TYPE_DEFINITION:
				return ((InternalEList<?>)getTypeDefinition()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__ENUM_TYPE:
				return ((InternalEList<?>)getEnumType()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__ENTITY_CONTAINER:
				return ((InternalEList<?>)getEntityContainer()).basicRemove(otherEnd, msgs);
			case EdmPackage.SCHEMA_TYPE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdmPackage.SCHEMA_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.SCHEMA_TYPE__COMPLEX_TYPE:
				return getComplexType();
			case EdmPackage.SCHEMA_TYPE__ENTITY_TYPE:
				return getEntityType();
			case EdmPackage.SCHEMA_TYPE__TYPE_DEFINITION:
				return getTypeDefinition();
			case EdmPackage.SCHEMA_TYPE__ENUM_TYPE:
				return getEnumType();
			case EdmPackage.SCHEMA_TYPE__ACTION:
				return getAction();
			case EdmPackage.SCHEMA_TYPE__FUNCTION:
				return getFunction();
			case EdmPackage.SCHEMA_TYPE__TERM:
				return getTerm();
			case EdmPackage.SCHEMA_TYPE__ANNOTATIONS:
				return getAnnotations();
			case EdmPackage.SCHEMA_TYPE__ENTITY_CONTAINER:
				return getEntityContainer();
			case EdmPackage.SCHEMA_TYPE__ANNOTATION:
				return getAnnotation();
			case EdmPackage.SCHEMA_TYPE__ALIAS:
				return getAlias();
			case EdmPackage.SCHEMA_TYPE__NAMESPACE:
				return getNamespace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdmPackage.SCHEMA_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__COMPLEX_TYPE:
				getComplexType().clear();
				getComplexType().addAll((Collection<? extends TComplexType>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__ENTITY_TYPE:
				getEntityType().clear();
				getEntityType().addAll((Collection<? extends TEntityType>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__TYPE_DEFINITION:
				getTypeDefinition().clear();
				getTypeDefinition().addAll((Collection<? extends TTypeDefinition>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__ENUM_TYPE:
				getEnumType().clear();
				getEnumType().addAll((Collection<? extends TEnumType>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends TAction>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends TFunction>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends TTerm>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends TAnnotations>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__ENTITY_CONTAINER:
				getEntityContainer().clear();
				getEntityContainer().addAll((Collection<? extends TEntityContainer>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__ALIAS:
				setAlias((String)newValue);
				return;
			case EdmPackage.SCHEMA_TYPE__NAMESPACE:
				setNamespace((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdmPackage.SCHEMA_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__COMPLEX_TYPE:
				getComplexType().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__ENTITY_TYPE:
				getEntityType().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__TYPE_DEFINITION:
				getTypeDefinition().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__ENUM_TYPE:
				getEnumType().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__ACTION:
				getAction().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__TERM:
				getTerm().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__ENTITY_CONTAINER:
				getEntityContainer().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.SCHEMA_TYPE__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case EdmPackage.SCHEMA_TYPE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdmPackage.SCHEMA_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.SCHEMA_TYPE__COMPLEX_TYPE:
				return !getComplexType().isEmpty();
			case EdmPackage.SCHEMA_TYPE__ENTITY_TYPE:
				return !getEntityType().isEmpty();
			case EdmPackage.SCHEMA_TYPE__TYPE_DEFINITION:
				return !getTypeDefinition().isEmpty();
			case EdmPackage.SCHEMA_TYPE__ENUM_TYPE:
				return !getEnumType().isEmpty();
			case EdmPackage.SCHEMA_TYPE__ACTION:
				return !getAction().isEmpty();
			case EdmPackage.SCHEMA_TYPE__FUNCTION:
				return !getFunction().isEmpty();
			case EdmPackage.SCHEMA_TYPE__TERM:
				return !getTerm().isEmpty();
			case EdmPackage.SCHEMA_TYPE__ANNOTATIONS:
				return !getAnnotations().isEmpty();
			case EdmPackage.SCHEMA_TYPE__ENTITY_CONTAINER:
				return !getEntityContainer().isEmpty();
			case EdmPackage.SCHEMA_TYPE__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.SCHEMA_TYPE__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case EdmPackage.SCHEMA_TYPE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", alias: ");
		result.append(alias);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //SchemaTypeImpl
