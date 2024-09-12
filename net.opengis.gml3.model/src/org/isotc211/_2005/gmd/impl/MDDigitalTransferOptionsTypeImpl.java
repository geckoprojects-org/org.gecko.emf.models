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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.RealPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIOnlineResourcePropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDDigitalTransferOptionsType;
import org.isotc211._2005.gmd.MDMediumPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Digital Transfer Options Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDigitalTransferOptionsTypeImpl#getUnitsOfDistribution <em>Units Of Distribution</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDigitalTransferOptionsTypeImpl#getTransferSize <em>Transfer Size</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDigitalTransferOptionsTypeImpl#getOnLine <em>On Line</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDigitalTransferOptionsTypeImpl#getOffLine <em>Off Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDDigitalTransferOptionsTypeImpl extends AbstractObjectTypeImpl implements MDDigitalTransferOptionsType {
	/**
	 * The cached value of the '{@link #getUnitsOfDistribution() <em>Units Of Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfDistribution()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType unitsOfDistribution;

	/**
	 * The cached value of the '{@link #getTransferSize() <em>Transfer Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferSize()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType transferSize;

	/**
	 * The cached value of the '{@link #getOnLine() <em>On Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnLine()
	 * @generated
	 * @ordered
	 */
	protected EList<CIOnlineResourcePropertyType> onLine;

	/**
	 * The cached value of the '{@link #getOffLine() <em>Off Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffLine()
	 * @generated
	 * @ordered
	 */
	protected MDMediumPropertyType offLine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDDigitalTransferOptionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDDigitalTransferOptionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getUnitsOfDistribution() {
		return unitsOfDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitsOfDistribution(CharacterStringPropertyType newUnitsOfDistribution, NotificationChain msgs) {
		CharacterStringPropertyType oldUnitsOfDistribution = unitsOfDistribution;
		unitsOfDistribution = newUnitsOfDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__UNITS_OF_DISTRIBUTION, oldUnitsOfDistribution, newUnitsOfDistribution);
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
	public void setUnitsOfDistribution(CharacterStringPropertyType newUnitsOfDistribution) {
		if (newUnitsOfDistribution != unitsOfDistribution) {
			NotificationChain msgs = null;
			if (unitsOfDistribution != null)
				msgs = ((InternalEObject)unitsOfDistribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__UNITS_OF_DISTRIBUTION, null, msgs);
			if (newUnitsOfDistribution != null)
				msgs = ((InternalEObject)newUnitsOfDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__UNITS_OF_DISTRIBUTION, null, msgs);
			msgs = basicSetUnitsOfDistribution(newUnitsOfDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__UNITS_OF_DISTRIBUTION, newUnitsOfDistribution, newUnitsOfDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getTransferSize() {
		return transferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferSize(RealPropertyType newTransferSize, NotificationChain msgs) {
		RealPropertyType oldTransferSize = transferSize;
		transferSize = newTransferSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__TRANSFER_SIZE, oldTransferSize, newTransferSize);
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
	public void setTransferSize(RealPropertyType newTransferSize) {
		if (newTransferSize != transferSize) {
			NotificationChain msgs = null;
			if (transferSize != null)
				msgs = ((InternalEObject)transferSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__TRANSFER_SIZE, null, msgs);
			if (newTransferSize != null)
				msgs = ((InternalEObject)newTransferSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__TRANSFER_SIZE, null, msgs);
			msgs = basicSetTransferSize(newTransferSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__TRANSFER_SIZE, newTransferSize, newTransferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIOnlineResourcePropertyType> getOnLine() {
		if (onLine == null) {
			onLine = new EObjectContainmentEList<CIOnlineResourcePropertyType>(CIOnlineResourcePropertyType.class, this, GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__ON_LINE);
		}
		return onLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMediumPropertyType getOffLine() {
		return offLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffLine(MDMediumPropertyType newOffLine, NotificationChain msgs) {
		MDMediumPropertyType oldOffLine = offLine;
		offLine = newOffLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__OFF_LINE, oldOffLine, newOffLine);
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
	public void setOffLine(MDMediumPropertyType newOffLine) {
		if (newOffLine != offLine) {
			NotificationChain msgs = null;
			if (offLine != null)
				msgs = ((InternalEObject)offLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__OFF_LINE, null, msgs);
			if (newOffLine != null)
				msgs = ((InternalEObject)newOffLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__OFF_LINE, null, msgs);
			msgs = basicSetOffLine(newOffLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__OFF_LINE, newOffLine, newOffLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__UNITS_OF_DISTRIBUTION:
				return basicSetUnitsOfDistribution(null, msgs);
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__TRANSFER_SIZE:
				return basicSetTransferSize(null, msgs);
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__ON_LINE:
				return ((InternalEList<?>)getOnLine()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__OFF_LINE:
				return basicSetOffLine(null, msgs);
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
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__UNITS_OF_DISTRIBUTION:
				return getUnitsOfDistribution();
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__TRANSFER_SIZE:
				return getTransferSize();
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__ON_LINE:
				return getOnLine();
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__OFF_LINE:
				return getOffLine();
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
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__UNITS_OF_DISTRIBUTION:
				setUnitsOfDistribution((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__TRANSFER_SIZE:
				setTransferSize((RealPropertyType)newValue);
				return;
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__ON_LINE:
				getOnLine().clear();
				getOnLine().addAll((Collection<? extends CIOnlineResourcePropertyType>)newValue);
				return;
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__OFF_LINE:
				setOffLine((MDMediumPropertyType)newValue);
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
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__UNITS_OF_DISTRIBUTION:
				setUnitsOfDistribution((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__TRANSFER_SIZE:
				setTransferSize((RealPropertyType)null);
				return;
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__ON_LINE:
				getOnLine().clear();
				return;
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__OFF_LINE:
				setOffLine((MDMediumPropertyType)null);
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
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__UNITS_OF_DISTRIBUTION:
				return unitsOfDistribution != null;
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__TRANSFER_SIZE:
				return transferSize != null;
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__ON_LINE:
				return onLine != null && !onLine.isEmpty();
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE__OFF_LINE:
				return offLine != null;
		}
		return super.eIsSet(featureID);
	}

} //MDDigitalTransferOptionsTypeImpl
