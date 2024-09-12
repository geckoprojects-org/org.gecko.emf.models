/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.kml.impl;

import java.util.Collection;

import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.DocumentType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.SchemaType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.DocumentTypeImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentTypeImpl#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentTypeImpl#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentTypeImpl#getDocumentSimpleExtensionGroupGroup <em>Document Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentTypeImpl#getDocumentSimpleExtensionGroup <em>Document Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentTypeImpl#getDocumentObjectExtensionGroupGroup <em>Document Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.DocumentTypeImpl#getDocumentObjectExtensionGroup <em>Document Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentTypeImpl extends AbstractContainerTypeImpl implements DocumentType {
	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaType> schema;

	/**
	 * The cached value of the '{@link #getAbstractFeatureGroupGroup() <em>Abstract Feature Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFeatureGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractFeatureGroupGroup;

	/**
	 * The cached value of the '{@link #getDocumentSimpleExtensionGroupGroup() <em>Document Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getDocumentObjectExtensionGroupGroup() <em>Document Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getDocumentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchemaType> getSchema() {
		if (schema == null) {
			schema = new EObjectContainmentEList<SchemaType>(SchemaType.class, this, KMLPackage.DOCUMENT_TYPE__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractFeatureGroupGroup() {
		if (abstractFeatureGroupGroup == null) {
			abstractFeatureGroupGroup = new BasicFeatureMap(this, KMLPackage.DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP_GROUP);
		}
		return abstractFeatureGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFeatureType> getAbstractFeatureGroup() {
		return getAbstractFeatureGroupGroup().list(KMLPackage.eINSTANCE.getDocumentType_AbstractFeatureGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDocumentSimpleExtensionGroupGroup() {
		if (documentSimpleExtensionGroupGroup == null) {
			documentSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return documentSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getDocumentSimpleExtensionGroup() {
		return getDocumentSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getDocumentType_DocumentSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDocumentObjectExtensionGroupGroup() {
		if (documentObjectExtensionGroupGroup == null) {
			documentObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return documentObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getDocumentObjectExtensionGroup() {
		return getDocumentObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getDocumentType_DocumentObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.DOCUMENT_TYPE__SCHEMA:
				return ((InternalEList<?>)getSchema()).basicRemove(otherEnd, msgs);
			case KMLPackage.DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractFeatureGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP:
				return ((InternalEList<?>)getAbstractFeatureGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getDocumentSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getDocumentObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getDocumentObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.DOCUMENT_TYPE__SCHEMA:
				return getSchema();
			case KMLPackage.DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				if (coreType) return getAbstractFeatureGroupGroup();
				return ((FeatureMap.Internal)getAbstractFeatureGroupGroup()).getWrapper();
			case KMLPackage.DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP:
				return getAbstractFeatureGroup();
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getDocumentSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getDocumentSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP:
				return getDocumentSimpleExtensionGroup();
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getDocumentObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getDocumentObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP:
				return getDocumentObjectExtensionGroup();
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
			case KMLPackage.DOCUMENT_TYPE__SCHEMA:
				getSchema().clear();
				getSchema().addAll((Collection<? extends SchemaType>)newValue);
				return;
			case KMLPackage.DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractFeatureGroupGroup()).set(newValue);
				return;
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getDocumentSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getDocumentObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.DOCUMENT_TYPE__SCHEMA:
				getSchema().clear();
				return;
			case KMLPackage.DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				getAbstractFeatureGroupGroup().clear();
				return;
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP_GROUP:
				getDocumentSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP_GROUP:
				getDocumentObjectExtensionGroupGroup().clear();
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
			case KMLPackage.DOCUMENT_TYPE__SCHEMA:
				return schema != null && !schema.isEmpty();
			case KMLPackage.DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				return abstractFeatureGroupGroup != null && !abstractFeatureGroupGroup.isEmpty();
			case KMLPackage.DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP:
				return !getAbstractFeatureGroup().isEmpty();
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP_GROUP:
				return documentSimpleExtensionGroupGroup != null && !documentSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP:
				return !getDocumentSimpleExtensionGroup().isEmpty();
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP_GROUP:
				return documentObjectExtensionGroupGroup != null && !documentObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP:
				return !getDocumentObjectExtensionGroup().isEmpty();
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
		result.append(" (abstractFeatureGroupGroup: ");
		result.append(abstractFeatureGroupGroup);
		result.append(", documentSimpleExtensionGroupGroup: ");
		result.append(documentSimpleExtensionGroupGroup);
		result.append(", documentObjectExtensionGroupGroup: ");
		result.append(documentObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //DocumentTypeImpl
