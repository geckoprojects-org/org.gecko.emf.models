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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeAnliegenBeistandschaftType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeInhaberElterlicheSorgeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anliegensklaerung BSS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AnliegensklaerungBSSTypeImpl#getAnliegenBeistandschaft <em>Anliegen Beistandschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AnliegensklaerungBSSTypeImpl#isVaterschaftAnerkannt <em>Vaterschaft Anerkannt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AnliegensklaerungBSSTypeImpl#getInhaberElterlicheSorge <em>Inhaber Elterliche Sorge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnliegensklaerungBSSTypeImpl extends MinimalEObjectImpl.Container implements AnliegensklaerungBSSType {
	/**
	 * The cached value of the '{@link #getAnliegenBeistandschaft() <em>Anliegen Beistandschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnliegenBeistandschaft()
	 * @generated
	 * @ordered
	 */
	protected CodeAnliegenBeistandschaftType anliegenBeistandschaft;

	/**
	 * The default value of the '{@link #isVaterschaftAnerkannt() <em>Vaterschaft Anerkannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVaterschaftAnerkannt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VATERSCHAFT_ANERKANNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVaterschaftAnerkannt() <em>Vaterschaft Anerkannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVaterschaftAnerkannt()
	 * @generated
	 * @ordered
	 */
	protected boolean vaterschaftAnerkannt = VATERSCHAFT_ANERKANNT_EDEFAULT;

	/**
	 * This is true if the Vaterschaft Anerkannt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vaterschaftAnerkanntESet;

	/**
	 * The cached value of the '{@link #getInhaberElterlicheSorge() <em>Inhaber Elterliche Sorge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhaberElterlicheSorge()
	 * @generated
	 * @ordered
	 */
	protected CodeInhaberElterlicheSorgeType inhaberElterlicheSorge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnliegensklaerungBSSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.ANLIEGENSKLAERUNG_BSS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAnliegenBeistandschaftType getAnliegenBeistandschaft() {
		return anliegenBeistandschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnliegenBeistandschaft(CodeAnliegenBeistandschaftType newAnliegenBeistandschaft, NotificationChain msgs) {
		CodeAnliegenBeistandschaftType oldAnliegenBeistandschaft = anliegenBeistandschaft;
		anliegenBeistandschaft = newAnliegenBeistandschaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT, oldAnliegenBeistandschaft, newAnliegenBeistandschaft);
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
	public void setAnliegenBeistandschaft(CodeAnliegenBeistandschaftType newAnliegenBeistandschaft) {
		if (newAnliegenBeistandschaft != anliegenBeistandschaft) {
			NotificationChain msgs = null;
			if (anliegenBeistandschaft != null)
				msgs = ((InternalEObject)anliegenBeistandschaft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT, null, msgs);
			if (newAnliegenBeistandschaft != null)
				msgs = ((InternalEObject)newAnliegenBeistandschaft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT, null, msgs);
			msgs = basicSetAnliegenBeistandschaft(newAnliegenBeistandschaft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT, newAnliegenBeistandschaft, newAnliegenBeistandschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVaterschaftAnerkannt() {
		return vaterschaftAnerkannt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVaterschaftAnerkannt(boolean newVaterschaftAnerkannt) {
		boolean oldVaterschaftAnerkannt = vaterschaftAnerkannt;
		vaterschaftAnerkannt = newVaterschaftAnerkannt;
		boolean oldVaterschaftAnerkanntESet = vaterschaftAnerkanntESet;
		vaterschaftAnerkanntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__VATERSCHAFT_ANERKANNT, oldVaterschaftAnerkannt, vaterschaftAnerkannt, !oldVaterschaftAnerkanntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVaterschaftAnerkannt() {
		boolean oldVaterschaftAnerkannt = vaterschaftAnerkannt;
		boolean oldVaterschaftAnerkanntESet = vaterschaftAnerkanntESet;
		vaterschaftAnerkannt = VATERSCHAFT_ANERKANNT_EDEFAULT;
		vaterschaftAnerkanntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__VATERSCHAFT_ANERKANNT, oldVaterschaftAnerkannt, VATERSCHAFT_ANERKANNT_EDEFAULT, oldVaterschaftAnerkanntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVaterschaftAnerkannt() {
		return vaterschaftAnerkanntESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeInhaberElterlicheSorgeType getInhaberElterlicheSorge() {
		return inhaberElterlicheSorge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInhaberElterlicheSorge(CodeInhaberElterlicheSorgeType newInhaberElterlicheSorge, NotificationChain msgs) {
		CodeInhaberElterlicheSorgeType oldInhaberElterlicheSorge = inhaberElterlicheSorge;
		inhaberElterlicheSorge = newInhaberElterlicheSorge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE, oldInhaberElterlicheSorge, newInhaberElterlicheSorge);
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
	public void setInhaberElterlicheSorge(CodeInhaberElterlicheSorgeType newInhaberElterlicheSorge) {
		if (newInhaberElterlicheSorge != inhaberElterlicheSorge) {
			NotificationChain msgs = null;
			if (inhaberElterlicheSorge != null)
				msgs = ((InternalEObject)inhaberElterlicheSorge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE, null, msgs);
			if (newInhaberElterlicheSorge != null)
				msgs = ((InternalEObject)newInhaberElterlicheSorge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE, null, msgs);
			msgs = basicSetInhaberElterlicheSorge(newInhaberElterlicheSorge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE, newInhaberElterlicheSorge, newInhaberElterlicheSorge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT:
				return basicSetAnliegenBeistandschaft(null, msgs);
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE:
				return basicSetInhaberElterlicheSorge(null, msgs);
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
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT:
				return getAnliegenBeistandschaft();
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__VATERSCHAFT_ANERKANNT:
				return isVaterschaftAnerkannt();
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE:
				return getInhaberElterlicheSorge();
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
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT:
				setAnliegenBeistandschaft((CodeAnliegenBeistandschaftType)newValue);
				return;
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__VATERSCHAFT_ANERKANNT:
				setVaterschaftAnerkannt((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE:
				setInhaberElterlicheSorge((CodeInhaberElterlicheSorgeType)newValue);
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
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT:
				setAnliegenBeistandschaft((CodeAnliegenBeistandschaftType)null);
				return;
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__VATERSCHAFT_ANERKANNT:
				unsetVaterschaftAnerkannt();
				return;
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE:
				setInhaberElterlicheSorge((CodeInhaberElterlicheSorgeType)null);
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
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__ANLIEGEN_BEISTANDSCHAFT:
				return anliegenBeistandschaft != null;
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__VATERSCHAFT_ANERKANNT:
				return isSetVaterschaftAnerkannt();
			case BeistandschaftPackage.ANLIEGENSKLAERUNG_BSS_TYPE__INHABER_ELTERLICHE_SORGE:
				return inhaberElterlicheSorge != null;
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
		result.append(" (vaterschaftAnerkannt: ");
		if (vaterschaftAnerkanntESet) result.append(vaterschaftAnerkannt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AnliegensklaerungBSSTypeImpl
