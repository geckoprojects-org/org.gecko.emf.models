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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType;
import de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SectionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Stroke Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.CompoundStrokeTypeImpl#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.CompoundStrokeTypeImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundStrokeTypeImpl extends StrokeType5Impl implements CompoundStrokeType {
	/**
	 * The default value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected static final AdjustmentType ADJUSTMENT_EDEFAULT = AdjustmentType.NONE;

	/**
	 * The cached value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected AdjustmentType adjustment = ADJUSTMENT_EDEFAULT;

	/**
	 * This is true if the Adjustment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean adjustmentESet;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<SectionType> section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundStrokeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getCompoundStrokeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdjustmentType getAdjustment() {
		return adjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdjustment(AdjustmentType newAdjustment) {
		AdjustmentType oldAdjustment = adjustment;
		adjustment = newAdjustment == null ? ADJUSTMENT_EDEFAULT : newAdjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.COMPOUND_STROKE_TYPE__ADJUSTMENT, oldAdjustment, adjustment, !oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAdjustment() {
		AdjustmentType oldAdjustment = adjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustment = ADJUSTMENT_EDEFAULT;
		adjustmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.COMPOUND_STROKE_TYPE__ADJUSTMENT, oldAdjustment, ADJUSTMENT_EDEFAULT, oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAdjustment() {
		return adjustmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SectionType> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<SectionType>(SectionType.class, this, AAAPackage.COMPOUND_STROKE_TYPE__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.COMPOUND_STROKE_TYPE__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
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
			case AAAPackage.COMPOUND_STROKE_TYPE__ADJUSTMENT:
				return getAdjustment();
			case AAAPackage.COMPOUND_STROKE_TYPE__SECTION:
				return getSection();
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
			case AAAPackage.COMPOUND_STROKE_TYPE__ADJUSTMENT:
				setAdjustment((AdjustmentType)newValue);
				return;
			case AAAPackage.COMPOUND_STROKE_TYPE__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
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
			case AAAPackage.COMPOUND_STROKE_TYPE__ADJUSTMENT:
				unsetAdjustment();
				return;
			case AAAPackage.COMPOUND_STROKE_TYPE__SECTION:
				getSection().clear();
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
			case AAAPackage.COMPOUND_STROKE_TYPE__ADJUSTMENT:
				return isSetAdjustment();
			case AAAPackage.COMPOUND_STROKE_TYPE__SECTION:
				return section != null && !section.isEmpty();
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
		result.append(" (adjustment: ");
		if (adjustmentESet) result.append(adjustment); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CompoundStrokeTypeImpl
