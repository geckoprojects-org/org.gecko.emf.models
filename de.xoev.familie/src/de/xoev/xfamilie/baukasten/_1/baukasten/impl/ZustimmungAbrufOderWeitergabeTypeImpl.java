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

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeArtAbrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zustimmung Abruf Oder Weitergabe Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZustimmungAbrufOderWeitergabeTypeImpl#getArtDesAbrufsOderWeitergabe <em>Art Des Abrufs Oder Weitergabe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZustimmungAbrufOderWeitergabeTypeImpl#isZustimmungAbrufOderWeitergabe <em>Zustimmung Abruf Oder Weitergabe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZustimmungAbrufOderWeitergabeTypeImpl#getInhalteDesAbrufs <em>Inhalte Des Abrufs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZustimmungAbrufOderWeitergabeTypeImpl extends MinimalEObjectImpl.Container implements ZustimmungAbrufOderWeitergabeType {
	/**
	 * The cached value of the '{@link #getArtDesAbrufsOderWeitergabe() <em>Art Des Abrufs Oder Weitergabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtDesAbrufsOderWeitergabe()
	 * @generated
	 * @ordered
	 */
	protected CodeArtAbrufType artDesAbrufsOderWeitergabe;

	/**
	 * The default value of the '{@link #isZustimmungAbrufOderWeitergabe() <em>Zustimmung Abruf Oder Weitergabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungAbrufOderWeitergabe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungAbrufOderWeitergabe() <em>Zustimmung Abruf Oder Weitergabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungAbrufOderWeitergabe()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungAbrufOderWeitergabe = ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_EDEFAULT;

	/**
	 * This is true if the Zustimmung Abruf Oder Weitergabe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungAbrufOderWeitergabeESet;

	/**
	 * The default value of the '{@link #getInhalteDesAbrufs() <em>Inhalte Des Abrufs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhalteDesAbrufs()
	 * @generated
	 * @ordered
	 */
	protected static final String INHALTE_DES_ABRUFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInhalteDesAbrufs() <em>Inhalte Des Abrufs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhalteDesAbrufs()
	 * @generated
	 * @ordered
	 */
	protected String inhalteDesAbrufs = INHALTE_DES_ABRUFS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZustimmungAbrufOderWeitergabeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeArtAbrufType getArtDesAbrufsOderWeitergabe() {
		return artDesAbrufsOderWeitergabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtDesAbrufsOderWeitergabe(CodeArtAbrufType newArtDesAbrufsOderWeitergabe, NotificationChain msgs) {
		CodeArtAbrufType oldArtDesAbrufsOderWeitergabe = artDesAbrufsOderWeitergabe;
		artDesAbrufsOderWeitergabe = newArtDesAbrufsOderWeitergabe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE, oldArtDesAbrufsOderWeitergabe, newArtDesAbrufsOderWeitergabe);
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
	public void setArtDesAbrufsOderWeitergabe(CodeArtAbrufType newArtDesAbrufsOderWeitergabe) {
		if (newArtDesAbrufsOderWeitergabe != artDesAbrufsOderWeitergabe) {
			NotificationChain msgs = null;
			if (artDesAbrufsOderWeitergabe != null)
				msgs = ((InternalEObject)artDesAbrufsOderWeitergabe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE, null, msgs);
			if (newArtDesAbrufsOderWeitergabe != null)
				msgs = ((InternalEObject)newArtDesAbrufsOderWeitergabe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE, null, msgs);
			msgs = basicSetArtDesAbrufsOderWeitergabe(newArtDesAbrufsOderWeitergabe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE, newArtDesAbrufsOderWeitergabe, newArtDesAbrufsOderWeitergabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungAbrufOderWeitergabe() {
		return zustimmungAbrufOderWeitergabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungAbrufOderWeitergabe(boolean newZustimmungAbrufOderWeitergabe) {
		boolean oldZustimmungAbrufOderWeitergabe = zustimmungAbrufOderWeitergabe;
		zustimmungAbrufOderWeitergabe = newZustimmungAbrufOderWeitergabe;
		boolean oldZustimmungAbrufOderWeitergabeESet = zustimmungAbrufOderWeitergabeESet;
		zustimmungAbrufOderWeitergabeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ZUSTIMMUNG_ABRUF_ODER_WEITERGABE, oldZustimmungAbrufOderWeitergabe, zustimmungAbrufOderWeitergabe, !oldZustimmungAbrufOderWeitergabeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungAbrufOderWeitergabe() {
		boolean oldZustimmungAbrufOderWeitergabe = zustimmungAbrufOderWeitergabe;
		boolean oldZustimmungAbrufOderWeitergabeESet = zustimmungAbrufOderWeitergabeESet;
		zustimmungAbrufOderWeitergabe = ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_EDEFAULT;
		zustimmungAbrufOderWeitergabeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ZUSTIMMUNG_ABRUF_ODER_WEITERGABE, oldZustimmungAbrufOderWeitergabe, ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_EDEFAULT, oldZustimmungAbrufOderWeitergabeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungAbrufOderWeitergabe() {
		return zustimmungAbrufOderWeitergabeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInhalteDesAbrufs() {
		return inhalteDesAbrufs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInhalteDesAbrufs(String newInhalteDesAbrufs) {
		String oldInhalteDesAbrufs = inhalteDesAbrufs;
		inhalteDesAbrufs = newInhalteDesAbrufs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__INHALTE_DES_ABRUFS, oldInhalteDesAbrufs, inhalteDesAbrufs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE:
				return basicSetArtDesAbrufsOderWeitergabe(null, msgs);
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
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE:
				return getArtDesAbrufsOderWeitergabe();
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ZUSTIMMUNG_ABRUF_ODER_WEITERGABE:
				return isZustimmungAbrufOderWeitergabe();
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__INHALTE_DES_ABRUFS:
				return getInhalteDesAbrufs();
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
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE:
				setArtDesAbrufsOderWeitergabe((CodeArtAbrufType)newValue);
				return;
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ZUSTIMMUNG_ABRUF_ODER_WEITERGABE:
				setZustimmungAbrufOderWeitergabe((Boolean)newValue);
				return;
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__INHALTE_DES_ABRUFS:
				setInhalteDesAbrufs((String)newValue);
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
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE:
				setArtDesAbrufsOderWeitergabe((CodeArtAbrufType)null);
				return;
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ZUSTIMMUNG_ABRUF_ODER_WEITERGABE:
				unsetZustimmungAbrufOderWeitergabe();
				return;
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__INHALTE_DES_ABRUFS:
				setInhalteDesAbrufs(INHALTE_DES_ABRUFS_EDEFAULT);
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
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE:
				return artDesAbrufsOderWeitergabe != null;
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ZUSTIMMUNG_ABRUF_ODER_WEITERGABE:
				return isSetZustimmungAbrufOderWeitergabe();
			case BaukastenPackage.ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__INHALTE_DES_ABRUFS:
				return INHALTE_DES_ABRUFS_EDEFAULT == null ? inhalteDesAbrufs != null : !INHALTE_DES_ABRUFS_EDEFAULT.equals(inhalteDesAbrufs);
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
		result.append(" (zustimmungAbrufOderWeitergabe: ");
		if (zustimmungAbrufOderWeitergabeESet) result.append(zustimmungAbrufOderWeitergabe); else result.append("<unset>");
		result.append(", inhalteDesAbrufs: ");
		result.append(inhalteDesAbrufs);
		result.append(')');
		return result.toString();
	}

} //ZustimmungAbrufOderWeitergabeTypeImpl
