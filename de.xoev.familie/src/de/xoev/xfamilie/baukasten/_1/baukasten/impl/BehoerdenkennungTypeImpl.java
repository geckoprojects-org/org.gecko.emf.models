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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodePraefixType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behoerdenkennung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BehoerdenkennungTypeImpl#getPraefix <em>Praefix</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BehoerdenkennungTypeImpl#getKennung <em>Kennung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehoerdenkennungTypeImpl extends MinimalEObjectImpl.Container implements BehoerdenkennungType {
	/**
	 * The cached value of the '{@link #getPraefix() <em>Praefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraefix()
	 * @generated
	 * @ordered
	 */
	protected CodePraefixType praefix;

	/**
	 * The cached value of the '{@link #getKennung() <em>Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected Code kennung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehoerdenkennungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.BEHOERDENKENNUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodePraefixType getPraefix() {
		return praefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPraefix(CodePraefixType newPraefix, NotificationChain msgs) {
		CodePraefixType oldPraefix = praefix;
		praefix = newPraefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.BEHOERDENKENNUNG_TYPE__PRAEFIX, oldPraefix, newPraefix);
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
	public void setPraefix(CodePraefixType newPraefix) {
		if (newPraefix != praefix) {
			NotificationChain msgs = null;
			if (praefix != null)
				msgs = ((InternalEObject)praefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.BEHOERDENKENNUNG_TYPE__PRAEFIX, null, msgs);
			if (newPraefix != null)
				msgs = ((InternalEObject)newPraefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.BEHOERDENKENNUNG_TYPE__PRAEFIX, null, msgs);
			msgs = basicSetPraefix(newPraefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.BEHOERDENKENNUNG_TYPE__PRAEFIX, newPraefix, newPraefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getKennung() {
		return kennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKennung(Code newKennung, NotificationChain msgs) {
		Code oldKennung = kennung;
		kennung = newKennung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.BEHOERDENKENNUNG_TYPE__KENNUNG, oldKennung, newKennung);
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
	public void setKennung(Code newKennung) {
		if (newKennung != kennung) {
			NotificationChain msgs = null;
			if (kennung != null)
				msgs = ((InternalEObject)kennung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.BEHOERDENKENNUNG_TYPE__KENNUNG, null, msgs);
			if (newKennung != null)
				msgs = ((InternalEObject)newKennung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.BEHOERDENKENNUNG_TYPE__KENNUNG, null, msgs);
			msgs = basicSetKennung(newKennung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.BEHOERDENKENNUNG_TYPE__KENNUNG, newKennung, newKennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__PRAEFIX:
				return basicSetPraefix(null, msgs);
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__KENNUNG:
				return basicSetKennung(null, msgs);
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
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__PRAEFIX:
				return getPraefix();
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__KENNUNG:
				return getKennung();
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
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__PRAEFIX:
				setPraefix((CodePraefixType)newValue);
				return;
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__KENNUNG:
				setKennung((Code)newValue);
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
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__PRAEFIX:
				setPraefix((CodePraefixType)null);
				return;
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__KENNUNG:
				setKennung((Code)null);
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
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__PRAEFIX:
				return praefix != null;
			case BaukastenPackage.BEHOERDENKENNUNG_TYPE__KENNUNG:
				return kennung != null;
		}
		return super.eIsSet(featureID);
	}

} //BehoerdenkennungTypeImpl
