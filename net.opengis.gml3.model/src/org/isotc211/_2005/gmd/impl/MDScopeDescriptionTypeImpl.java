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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.ObjectReferencePropertyType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDScopeDescriptionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Scope Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDScopeDescriptionTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDScopeDescriptionTypeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDScopeDescriptionTypeImpl#getFeatureInstances <em>Feature Instances</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDScopeDescriptionTypeImpl#getAttributeInstances <em>Attribute Instances</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDScopeDescriptionTypeImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDScopeDescriptionTypeImpl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDScopeDescriptionTypeImpl extends MinimalEObjectImpl.Container implements MDScopeDescriptionType {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectReferencePropertyType> attributes;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectReferencePropertyType> features;

	/**
	 * The cached value of the '{@link #getFeatureInstances() <em>Feature Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectReferencePropertyType> featureInstances;

	/**
	 * The cached value of the '{@link #getAttributeInstances() <em>Attribute Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectReferencePropertyType> attributeInstances;

	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType dataset;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType other;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDScopeDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDScopeDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectReferencePropertyType> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<ObjectReferencePropertyType>(ObjectReferencePropertyType.class, this, GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectReferencePropertyType> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<ObjectReferencePropertyType>(ObjectReferencePropertyType.class, this, GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectReferencePropertyType> getFeatureInstances() {
		if (featureInstances == null) {
			featureInstances = new EObjectContainmentEList<ObjectReferencePropertyType>(ObjectReferencePropertyType.class, this, GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURE_INSTANCES);
		}
		return featureInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObjectReferencePropertyType> getAttributeInstances() {
		if (attributeInstances == null) {
			attributeInstances = new EObjectContainmentEList<ObjectReferencePropertyType>(ObjectReferencePropertyType.class, this, GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTE_INSTANCES);
		}
		return attributeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDataset() {
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataset(CharacterStringPropertyType newDataset, NotificationChain msgs) {
		CharacterStringPropertyType oldDataset = dataset;
		dataset = newDataset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__DATASET, oldDataset, newDataset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataset(CharacterStringPropertyType newDataset) {
		if (newDataset != dataset) {
			NotificationChain msgs = null;
			if (dataset != null)
				msgs = ((InternalEObject)dataset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__DATASET, null, msgs);
			if (newDataset != null)
				msgs = ((InternalEObject)newDataset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__DATASET, null, msgs);
			msgs = basicSetDataset(newDataset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__DATASET, newDataset, newDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOther(CharacterStringPropertyType newOther, NotificationChain msgs) {
		CharacterStringPropertyType oldOther = other;
		other = newOther;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__OTHER, oldOther, newOther);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther(CharacterStringPropertyType newOther) {
		if (newOther != other) {
			NotificationChain msgs = null;
			if (other != null)
				msgs = ((InternalEObject)other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__OTHER, null, msgs);
			if (newOther != null)
				msgs = ((InternalEObject)newOther).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__OTHER, null, msgs);
			msgs = basicSetOther(newOther, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__OTHER, newOther, newOther));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURE_INSTANCES:
				return ((InternalEList<?>)getFeatureInstances()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTE_INSTANCES:
				return ((InternalEList<?>)getAttributeInstances()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__DATASET:
				return basicSetDataset(null, msgs);
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__OTHER:
				return basicSetOther(null, msgs);
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
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTES:
				return getAttributes();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURES:
				return getFeatures();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURE_INSTANCES:
				return getFeatureInstances();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTE_INSTANCES:
				return getAttributeInstances();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__DATASET:
				return getDataset();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__OTHER:
				return getOther();
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
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ObjectReferencePropertyType>)newValue);
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ObjectReferencePropertyType>)newValue);
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURE_INSTANCES:
				getFeatureInstances().clear();
				getFeatureInstances().addAll((Collection<? extends ObjectReferencePropertyType>)newValue);
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTE_INSTANCES:
				getAttributeInstances().clear();
				getAttributeInstances().addAll((Collection<? extends ObjectReferencePropertyType>)newValue);
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__DATASET:
				setDataset((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__OTHER:
				setOther((CharacterStringPropertyType)newValue);
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
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURES:
				getFeatures().clear();
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURE_INSTANCES:
				getFeatureInstances().clear();
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTE_INSTANCES:
				getAttributeInstances().clear();
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__DATASET:
				setDataset((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__OTHER:
				setOther((CharacterStringPropertyType)null);
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
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURES:
				return features != null && !features.isEmpty();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__FEATURE_INSTANCES:
				return featureInstances != null && !featureInstances.isEmpty();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__ATTRIBUTE_INSTANCES:
				return attributeInstances != null && !attributeInstances.isEmpty();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__DATASET:
				return dataset != null;
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE__OTHER:
				return other != null;
		}
		return super.eIsSet(featureID);
	}

} //MDScopeDescriptionTypeImpl
