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
import org.open.oasis.docs.odata.ns.edm.TEntitySet;
import org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEntity Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntitySetImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntitySetImpl#getNavigationPropertyBinding <em>Navigation Property Binding</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntitySetImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntitySetImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntitySetImpl#isIncludeInServiceDocument <em>Include In Service Document</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntitySetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TEntitySetImpl extends MinimalEObjectImpl.Container implements TEntitySet {
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
	 * The default value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected String entityType = ENTITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeInServiceDocument() <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInServiceDocument()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIncludeInServiceDocument() <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInServiceDocument()
	 * @generated
	 * @ordered
	 */
	protected boolean includeInServiceDocument = INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT;

	/**
	 * This is true if the Include In Service Document attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean includeInServiceDocumentESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEntitySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTEntitySet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.TENTITY_SET__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TNavigationPropertyBinding> getNavigationPropertyBinding() {
		return getGroup().list(EdmPackage.eINSTANCE.getTEntitySet_NavigationPropertyBinding());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmPackage.eINSTANCE.getTEntitySet_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityType(String newEntityType) {
		String oldEntityType = entityType;
		entityType = newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TENTITY_SET__ENTITY_TYPE, oldEntityType, entityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeInServiceDocument() {
		return includeInServiceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInServiceDocument(boolean newIncludeInServiceDocument) {
		boolean oldIncludeInServiceDocument = includeInServiceDocument;
		includeInServiceDocument = newIncludeInServiceDocument;
		boolean oldIncludeInServiceDocumentESet = includeInServiceDocumentESet;
		includeInServiceDocumentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT, oldIncludeInServiceDocument, includeInServiceDocument, !oldIncludeInServiceDocumentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIncludeInServiceDocument() {
		boolean oldIncludeInServiceDocument = includeInServiceDocument;
		boolean oldIncludeInServiceDocumentESet = includeInServiceDocumentESet;
		includeInServiceDocument = INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT;
		includeInServiceDocumentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT, oldIncludeInServiceDocument, INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT, oldIncludeInServiceDocumentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIncludeInServiceDocument() {
		return includeInServiceDocumentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TENTITY_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TENTITY_SET__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.TENTITY_SET__NAVIGATION_PROPERTY_BINDING:
				return ((InternalEList<?>)getNavigationPropertyBinding()).basicRemove(otherEnd, msgs);
			case EdmPackage.TENTITY_SET__ANNOTATION:
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
			case EdmPackage.TENTITY_SET__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.TENTITY_SET__NAVIGATION_PROPERTY_BINDING:
				return getNavigationPropertyBinding();
			case EdmPackage.TENTITY_SET__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TENTITY_SET__ENTITY_TYPE:
				return getEntityType();
			case EdmPackage.TENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT:
				return isIncludeInServiceDocument();
			case EdmPackage.TENTITY_SET__NAME:
				return getName();
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
			case EdmPackage.TENTITY_SET__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.TENTITY_SET__NAVIGATION_PROPERTY_BINDING:
				getNavigationPropertyBinding().clear();
				getNavigationPropertyBinding().addAll((Collection<? extends TNavigationPropertyBinding>)newValue);
				return;
			case EdmPackage.TENTITY_SET__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TENTITY_SET__ENTITY_TYPE:
				setEntityType((String)newValue);
				return;
			case EdmPackage.TENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT:
				setIncludeInServiceDocument((Boolean)newValue);
				return;
			case EdmPackage.TENTITY_SET__NAME:
				setName((String)newValue);
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
			case EdmPackage.TENTITY_SET__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.TENTITY_SET__NAVIGATION_PROPERTY_BINDING:
				getNavigationPropertyBinding().clear();
				return;
			case EdmPackage.TENTITY_SET__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TENTITY_SET__ENTITY_TYPE:
				setEntityType(ENTITY_TYPE_EDEFAULT);
				return;
			case EdmPackage.TENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT:
				unsetIncludeInServiceDocument();
				return;
			case EdmPackage.TENTITY_SET__NAME:
				setName(NAME_EDEFAULT);
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
			case EdmPackage.TENTITY_SET__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.TENTITY_SET__NAVIGATION_PROPERTY_BINDING:
				return !getNavigationPropertyBinding().isEmpty();
			case EdmPackage.TENTITY_SET__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.TENTITY_SET__ENTITY_TYPE:
				return ENTITY_TYPE_EDEFAULT == null ? entityType != null : !ENTITY_TYPE_EDEFAULT.equals(entityType);
			case EdmPackage.TENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT:
				return isSetIncludeInServiceDocument();
			case EdmPackage.TENTITY_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", entityType: ");
		result.append(entityType);
		result.append(", includeInServiceDocument: ");
		if (includeInServiceDocumentESet) result.append(includeInServiceDocument); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TEntitySetImpl
