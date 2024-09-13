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
package org.w3.owl.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.w3.owl.OwlPackage;
import org.w3.owl.Restriction;

import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.impl.RestrictionImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.impl.RestrictionImpl#getMaxCardinality <em>Max Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.impl.RestrictionImpl#getMaxQualifiedCardinality <em>Max Qualified Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.impl.RestrictionImpl#getMinCardinality <em>Min Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.impl.RestrictionImpl#getMinQualifiedCardinality <em>Min Qualified Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.impl.RestrictionImpl#getQualifiedCardinality <em>Qualified Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.impl.RestrictionImpl#getHasSelf <em>Has Self</em>}</li>
 *   <li>{@link org.w3.owl.impl.RestrictionImpl#getOnProperites <em>On Properites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictionImpl extends ClassImpl implements Restriction {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCardinality() <em>Max Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCardinality() <em>Max Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCardinality()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxCardinality = MAX_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxQualifiedCardinality() <em>Max Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQualifiedCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_QUALIFIED_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxQualifiedCardinality() <em>Max Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQualifiedCardinality()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxQualifiedCardinality = MAX_QUALIFIED_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinCardinality() <em>Min Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinCardinality() <em>Min Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCardinality()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minCardinality = MIN_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinQualifiedCardinality() <em>Min Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQualifiedCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_QUALIFIED_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinQualifiedCardinality() <em>Min Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQualifiedCardinality()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minQualifiedCardinality = MIN_QUALIFIED_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedCardinality() <em>Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUALIFIED_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedCardinality() <em>Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedCardinality()
	 * @generated
	 * @ordered
	 */
	protected BigInteger qualifiedCardinality = QUALIFIED_CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasSelf() <em>Has Self</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSelf()
	 * @generated
	 * @ordered
	 */
	protected RDFResource hasSelf;

	/**
	 * The cached value of the '{@link #getOnProperites() <em>On Properites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnProperites()
	 * @generated
	 * @ordered
	 */
	protected EList<RDFResource> onProperites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(BigInteger newCardinality) {
		BigInteger oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.RESTRICTION__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaxCardinality() {
		return maxCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCardinality(BigInteger newMaxCardinality) {
		BigInteger oldMaxCardinality = maxCardinality;
		maxCardinality = newMaxCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.RESTRICTION__MAX_CARDINALITY, oldMaxCardinality, maxCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaxQualifiedCardinality() {
		return maxQualifiedCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxQualifiedCardinality(BigInteger newMaxQualifiedCardinality) {
		BigInteger oldMaxQualifiedCardinality = maxQualifiedCardinality;
		maxQualifiedCardinality = newMaxQualifiedCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.RESTRICTION__MAX_QUALIFIED_CARDINALITY, oldMaxQualifiedCardinality, maxQualifiedCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMinCardinality() {
		return minCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinCardinality(BigInteger newMinCardinality) {
		BigInteger oldMinCardinality = minCardinality;
		minCardinality = newMinCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.RESTRICTION__MIN_CARDINALITY, oldMinCardinality, minCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMinQualifiedCardinality() {
		return minQualifiedCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinQualifiedCardinality(BigInteger newMinQualifiedCardinality) {
		BigInteger oldMinQualifiedCardinality = minQualifiedCardinality;
		minQualifiedCardinality = newMinQualifiedCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.RESTRICTION__MIN_QUALIFIED_CARDINALITY, oldMinQualifiedCardinality, minQualifiedCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getQualifiedCardinality() {
		return qualifiedCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifiedCardinality(BigInteger newQualifiedCardinality) {
		BigInteger oldQualifiedCardinality = qualifiedCardinality;
		qualifiedCardinality = newQualifiedCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.RESTRICTION__QUALIFIED_CARDINALITY, oldQualifiedCardinality, qualifiedCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFResource getHasSelf() {
		if (hasSelf != null && hasSelf.eIsProxy()) {
			InternalEObject oldHasSelf = (InternalEObject)hasSelf;
			hasSelf = (RDFResource)eResolveProxy(oldHasSelf);
			if (hasSelf != oldHasSelf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.RESTRICTION__HAS_SELF, oldHasSelf, hasSelf));
			}
		}
		return hasSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFResource basicGetHasSelf() {
		return hasSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasSelf(RDFResource newHasSelf) {
		RDFResource oldHasSelf = hasSelf;
		hasSelf = newHasSelf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.RESTRICTION__HAS_SELF, oldHasSelf, hasSelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RDFResource> getOnProperites() {
		if (onProperites == null) {
			onProperites = new EObjectResolvingEList<RDFResource>(RDFResource.class, this, OwlPackage.RESTRICTION__ON_PROPERITES);
		}
		return onProperites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.RESTRICTION__CARDINALITY:
				return getCardinality();
			case OwlPackage.RESTRICTION__MAX_CARDINALITY:
				return getMaxCardinality();
			case OwlPackage.RESTRICTION__MAX_QUALIFIED_CARDINALITY:
				return getMaxQualifiedCardinality();
			case OwlPackage.RESTRICTION__MIN_CARDINALITY:
				return getMinCardinality();
			case OwlPackage.RESTRICTION__MIN_QUALIFIED_CARDINALITY:
				return getMinQualifiedCardinality();
			case OwlPackage.RESTRICTION__QUALIFIED_CARDINALITY:
				return getQualifiedCardinality();
			case OwlPackage.RESTRICTION__HAS_SELF:
				if (resolve) return getHasSelf();
				return basicGetHasSelf();
			case OwlPackage.RESTRICTION__ON_PROPERITES:
				return getOnProperites();
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
			case OwlPackage.RESTRICTION__CARDINALITY:
				setCardinality((BigInteger)newValue);
				return;
			case OwlPackage.RESTRICTION__MAX_CARDINALITY:
				setMaxCardinality((BigInteger)newValue);
				return;
			case OwlPackage.RESTRICTION__MAX_QUALIFIED_CARDINALITY:
				setMaxQualifiedCardinality((BigInteger)newValue);
				return;
			case OwlPackage.RESTRICTION__MIN_CARDINALITY:
				setMinCardinality((BigInteger)newValue);
				return;
			case OwlPackage.RESTRICTION__MIN_QUALIFIED_CARDINALITY:
				setMinQualifiedCardinality((BigInteger)newValue);
				return;
			case OwlPackage.RESTRICTION__QUALIFIED_CARDINALITY:
				setQualifiedCardinality((BigInteger)newValue);
				return;
			case OwlPackage.RESTRICTION__HAS_SELF:
				setHasSelf((RDFResource)newValue);
				return;
			case OwlPackage.RESTRICTION__ON_PROPERITES:
				getOnProperites().clear();
				getOnProperites().addAll((Collection<? extends RDFResource>)newValue);
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
			case OwlPackage.RESTRICTION__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case OwlPackage.RESTRICTION__MAX_CARDINALITY:
				setMaxCardinality(MAX_CARDINALITY_EDEFAULT);
				return;
			case OwlPackage.RESTRICTION__MAX_QUALIFIED_CARDINALITY:
				setMaxQualifiedCardinality(MAX_QUALIFIED_CARDINALITY_EDEFAULT);
				return;
			case OwlPackage.RESTRICTION__MIN_CARDINALITY:
				setMinCardinality(MIN_CARDINALITY_EDEFAULT);
				return;
			case OwlPackage.RESTRICTION__MIN_QUALIFIED_CARDINALITY:
				setMinQualifiedCardinality(MIN_QUALIFIED_CARDINALITY_EDEFAULT);
				return;
			case OwlPackage.RESTRICTION__QUALIFIED_CARDINALITY:
				setQualifiedCardinality(QUALIFIED_CARDINALITY_EDEFAULT);
				return;
			case OwlPackage.RESTRICTION__HAS_SELF:
				setHasSelf((RDFResource)null);
				return;
			case OwlPackage.RESTRICTION__ON_PROPERITES:
				getOnProperites().clear();
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
			case OwlPackage.RESTRICTION__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case OwlPackage.RESTRICTION__MAX_CARDINALITY:
				return MAX_CARDINALITY_EDEFAULT == null ? maxCardinality != null : !MAX_CARDINALITY_EDEFAULT.equals(maxCardinality);
			case OwlPackage.RESTRICTION__MAX_QUALIFIED_CARDINALITY:
				return MAX_QUALIFIED_CARDINALITY_EDEFAULT == null ? maxQualifiedCardinality != null : !MAX_QUALIFIED_CARDINALITY_EDEFAULT.equals(maxQualifiedCardinality);
			case OwlPackage.RESTRICTION__MIN_CARDINALITY:
				return MIN_CARDINALITY_EDEFAULT == null ? minCardinality != null : !MIN_CARDINALITY_EDEFAULT.equals(minCardinality);
			case OwlPackage.RESTRICTION__MIN_QUALIFIED_CARDINALITY:
				return MIN_QUALIFIED_CARDINALITY_EDEFAULT == null ? minQualifiedCardinality != null : !MIN_QUALIFIED_CARDINALITY_EDEFAULT.equals(minQualifiedCardinality);
			case OwlPackage.RESTRICTION__QUALIFIED_CARDINALITY:
				return QUALIFIED_CARDINALITY_EDEFAULT == null ? qualifiedCardinality != null : !QUALIFIED_CARDINALITY_EDEFAULT.equals(qualifiedCardinality);
			case OwlPackage.RESTRICTION__HAS_SELF:
				return hasSelf != null;
			case OwlPackage.RESTRICTION__ON_PROPERITES:
				return onProperites != null && !onProperites.isEmpty();
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", maxCardinality: ");
		result.append(maxCardinality);
		result.append(", maxQualifiedCardinality: ");
		result.append(maxQualifiedCardinality);
		result.append(", minCardinality: ");
		result.append(minCardinality);
		result.append(", minQualifiedCardinality: ");
		result.append(minQualifiedCardinality);
		result.append(", qualifiedCardinality: ");
		result.append(qualifiedCardinality);
		result.append(')');
		return result.toString();
	}

} //RestrictionImpl
