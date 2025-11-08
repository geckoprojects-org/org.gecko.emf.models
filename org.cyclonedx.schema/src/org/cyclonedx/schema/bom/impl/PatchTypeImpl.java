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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.DiffType;
import org.cyclonedx.schema.bom.PatchClassification;
import org.cyclonedx.schema.bom.PatchType;
import org.cyclonedx.schema.bom.ResolvesType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PatchTypeImpl#getDiff <em>Diff</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PatchTypeImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PatchTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PatchTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatchTypeImpl extends MinimalEObjectImpl.Container implements PatchType {
	/**
	 * The cached value of the '{@link #getDiff() <em>Diff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff()
	 * @generated
	 * @ordered
	 */
	protected DiffType diff;

	/**
	 * The cached value of the '{@link #getResolves() <em>Resolves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolves()
	 * @generated
	 * @ordered
	 */
	protected ResolvesType1 resolves;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PatchClassification TYPE_EDEFAULT = PatchClassification.UNOFFICIAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PatchClassification type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getPatchType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffType getDiff() {
		return diff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiff(DiffType newDiff, NotificationChain msgs) {
		DiffType oldDiff = diff;
		diff = newDiff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PATCH_TYPE__DIFF, oldDiff, newDiff);
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
	public void setDiff(DiffType newDiff) {
		if (newDiff != diff) {
			NotificationChain msgs = null;
			if (diff != null)
				msgs = ((InternalEObject)diff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PATCH_TYPE__DIFF, null, msgs);
			if (newDiff != null)
				msgs = ((InternalEObject)newDiff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PATCH_TYPE__DIFF, null, msgs);
			msgs = basicSetDiff(newDiff, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PATCH_TYPE__DIFF, newDiff, newDiff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResolvesType1 getResolves() {
		return resolves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolves(ResolvesType1 newResolves, NotificationChain msgs) {
		ResolvesType1 oldResolves = resolves;
		resolves = newResolves;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PATCH_TYPE__RESOLVES, oldResolves, newResolves);
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
	public void setResolves(ResolvesType1 newResolves) {
		if (newResolves != resolves) {
			NotificationChain msgs = null;
			if (resolves != null)
				msgs = ((InternalEObject)resolves).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PATCH_TYPE__RESOLVES, null, msgs);
			if (newResolves != null)
				msgs = ((InternalEObject)newResolves).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PATCH_TYPE__RESOLVES, null, msgs);
			msgs = basicSetResolves(newResolves, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PATCH_TYPE__RESOLVES, newResolves, newResolves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.PATCH_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatchClassification getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PatchClassification newType) {
		PatchClassification oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PATCH_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		PatchClassification oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.PATCH_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.PATCH_TYPE__DIFF:
				return basicSetDiff(null, msgs);
			case BOMPackage.PATCH_TYPE__RESOLVES:
				return basicSetResolves(null, msgs);
			case BOMPackage.PATCH_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.PATCH_TYPE__DIFF:
				return getDiff();
			case BOMPackage.PATCH_TYPE__RESOLVES:
				return getResolves();
			case BOMPackage.PATCH_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.PATCH_TYPE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.PATCH_TYPE__DIFF:
				setDiff((DiffType)newValue);
				return;
			case BOMPackage.PATCH_TYPE__RESOLVES:
				setResolves((ResolvesType1)newValue);
				return;
			case BOMPackage.PATCH_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.PATCH_TYPE__TYPE:
				setType((PatchClassification)newValue);
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
			case BOMPackage.PATCH_TYPE__DIFF:
				setDiff((DiffType)null);
				return;
			case BOMPackage.PATCH_TYPE__RESOLVES:
				setResolves((ResolvesType1)null);
				return;
			case BOMPackage.PATCH_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.PATCH_TYPE__TYPE:
				unsetType();
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
			case BOMPackage.PATCH_TYPE__DIFF:
				return diff != null;
			case BOMPackage.PATCH_TYPE__RESOLVES:
				return resolves != null;
			case BOMPackage.PATCH_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.PATCH_TYPE__TYPE:
				return isSetType();
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
		result.append(" (any: ");
		result.append(any);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PatchTypeImpl
