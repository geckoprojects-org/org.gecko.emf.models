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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ZustimmungDatenabrufeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zustimmung Datenabrufe Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ZustimmungDatenabrufeTypeImpl#isZustimmungDatenabrufDSRV <em>Zustimmung Datenabruf DSRV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ZustimmungDatenabrufeTypeImpl#isZustimmungDatenabrufStandesamt <em>Zustimmung Datenabruf Standesamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ZustimmungDatenabrufeTypeImpl#isZustimmungDatenabrufKrankenkasse <em>Zustimmung Datenabruf Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ZustimmungDatenabrufeTypeImpl#isZustimmungDatenabrufFinanzamt <em>Zustimmung Datenabruf Finanzamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ZustimmungDatenabrufeTypeImpl#isZustimmungDatenabrufBeamte <em>Zustimmung Datenabruf Beamte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZustimmungDatenabrufeTypeImpl extends MinimalEObjectImpl.Container implements ZustimmungDatenabrufeType {
	/**
	 * The default value of the '{@link #isZustimmungDatenabrufDSRV() <em>Zustimmung Datenabruf DSRV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufDSRV()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_DATENABRUF_DSRV_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungDatenabrufDSRV() <em>Zustimmung Datenabruf DSRV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufDSRV()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufDSRV = ZUSTIMMUNG_DATENABRUF_DSRV_EDEFAULT;

	/**
	 * This is true if the Zustimmung Datenabruf DSRV attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufDSRVESet;

	/**
	 * The default value of the '{@link #isZustimmungDatenabrufStandesamt() <em>Zustimmung Datenabruf Standesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufStandesamt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_DATENABRUF_STANDESAMT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungDatenabrufStandesamt() <em>Zustimmung Datenabruf Standesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufStandesamt()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufStandesamt = ZUSTIMMUNG_DATENABRUF_STANDESAMT_EDEFAULT;

	/**
	 * This is true if the Zustimmung Datenabruf Standesamt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufStandesamtESet;

	/**
	 * The default value of the '{@link #isZustimmungDatenabrufKrankenkasse() <em>Zustimmung Datenabruf Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_DATENABRUF_KRANKENKASSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungDatenabrufKrankenkasse() <em>Zustimmung Datenabruf Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufKrankenkasse = ZUSTIMMUNG_DATENABRUF_KRANKENKASSE_EDEFAULT;

	/**
	 * This is true if the Zustimmung Datenabruf Krankenkasse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufKrankenkasseESet;

	/**
	 * The default value of the '{@link #isZustimmungDatenabrufFinanzamt() <em>Zustimmung Datenabruf Finanzamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufFinanzamt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_DATENABRUF_FINANZAMT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungDatenabrufFinanzamt() <em>Zustimmung Datenabruf Finanzamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufFinanzamt()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufFinanzamt = ZUSTIMMUNG_DATENABRUF_FINANZAMT_EDEFAULT;

	/**
	 * This is true if the Zustimmung Datenabruf Finanzamt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufFinanzamtESet;

	/**
	 * The default value of the '{@link #isZustimmungDatenabrufBeamte() <em>Zustimmung Datenabruf Beamte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufBeamte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_DATENABRUF_BEAMTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungDatenabrufBeamte() <em>Zustimmung Datenabruf Beamte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenabrufBeamte()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufBeamte = ZUSTIMMUNG_DATENABRUF_BEAMTE_EDEFAULT;

	/**
	 * This is true if the Zustimmung Datenabruf Beamte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenabrufBeamteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZustimmungDatenabrufeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getZustimmungDatenabrufeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungDatenabrufDSRV() {
		return zustimmungDatenabrufDSRV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungDatenabrufDSRV(boolean newZustimmungDatenabrufDSRV) {
		boolean oldZustimmungDatenabrufDSRV = zustimmungDatenabrufDSRV;
		zustimmungDatenabrufDSRV = newZustimmungDatenabrufDSRV;
		boolean oldZustimmungDatenabrufDSRVESet = zustimmungDatenabrufDSRVESet;
		zustimmungDatenabrufDSRVESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_DSRV, oldZustimmungDatenabrufDSRV, zustimmungDatenabrufDSRV, !oldZustimmungDatenabrufDSRVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungDatenabrufDSRV() {
		boolean oldZustimmungDatenabrufDSRV = zustimmungDatenabrufDSRV;
		boolean oldZustimmungDatenabrufDSRVESet = zustimmungDatenabrufDSRVESet;
		zustimmungDatenabrufDSRV = ZUSTIMMUNG_DATENABRUF_DSRV_EDEFAULT;
		zustimmungDatenabrufDSRVESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_DSRV, oldZustimmungDatenabrufDSRV, ZUSTIMMUNG_DATENABRUF_DSRV_EDEFAULT, oldZustimmungDatenabrufDSRVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungDatenabrufDSRV() {
		return zustimmungDatenabrufDSRVESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungDatenabrufStandesamt() {
		return zustimmungDatenabrufStandesamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungDatenabrufStandesamt(boolean newZustimmungDatenabrufStandesamt) {
		boolean oldZustimmungDatenabrufStandesamt = zustimmungDatenabrufStandesamt;
		zustimmungDatenabrufStandesamt = newZustimmungDatenabrufStandesamt;
		boolean oldZustimmungDatenabrufStandesamtESet = zustimmungDatenabrufStandesamtESet;
		zustimmungDatenabrufStandesamtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_STANDESAMT, oldZustimmungDatenabrufStandesamt, zustimmungDatenabrufStandesamt, !oldZustimmungDatenabrufStandesamtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungDatenabrufStandesamt() {
		boolean oldZustimmungDatenabrufStandesamt = zustimmungDatenabrufStandesamt;
		boolean oldZustimmungDatenabrufStandesamtESet = zustimmungDatenabrufStandesamtESet;
		zustimmungDatenabrufStandesamt = ZUSTIMMUNG_DATENABRUF_STANDESAMT_EDEFAULT;
		zustimmungDatenabrufStandesamtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_STANDESAMT, oldZustimmungDatenabrufStandesamt, ZUSTIMMUNG_DATENABRUF_STANDESAMT_EDEFAULT, oldZustimmungDatenabrufStandesamtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungDatenabrufStandesamt() {
		return zustimmungDatenabrufStandesamtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungDatenabrufKrankenkasse() {
		return zustimmungDatenabrufKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungDatenabrufKrankenkasse(boolean newZustimmungDatenabrufKrankenkasse) {
		boolean oldZustimmungDatenabrufKrankenkasse = zustimmungDatenabrufKrankenkasse;
		zustimmungDatenabrufKrankenkasse = newZustimmungDatenabrufKrankenkasse;
		boolean oldZustimmungDatenabrufKrankenkasseESet = zustimmungDatenabrufKrankenkasseESet;
		zustimmungDatenabrufKrankenkasseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_KRANKENKASSE, oldZustimmungDatenabrufKrankenkasse, zustimmungDatenabrufKrankenkasse, !oldZustimmungDatenabrufKrankenkasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungDatenabrufKrankenkasse() {
		boolean oldZustimmungDatenabrufKrankenkasse = zustimmungDatenabrufKrankenkasse;
		boolean oldZustimmungDatenabrufKrankenkasseESet = zustimmungDatenabrufKrankenkasseESet;
		zustimmungDatenabrufKrankenkasse = ZUSTIMMUNG_DATENABRUF_KRANKENKASSE_EDEFAULT;
		zustimmungDatenabrufKrankenkasseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_KRANKENKASSE, oldZustimmungDatenabrufKrankenkasse, ZUSTIMMUNG_DATENABRUF_KRANKENKASSE_EDEFAULT, oldZustimmungDatenabrufKrankenkasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungDatenabrufKrankenkasse() {
		return zustimmungDatenabrufKrankenkasseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungDatenabrufFinanzamt() {
		return zustimmungDatenabrufFinanzamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungDatenabrufFinanzamt(boolean newZustimmungDatenabrufFinanzamt) {
		boolean oldZustimmungDatenabrufFinanzamt = zustimmungDatenabrufFinanzamt;
		zustimmungDatenabrufFinanzamt = newZustimmungDatenabrufFinanzamt;
		boolean oldZustimmungDatenabrufFinanzamtESet = zustimmungDatenabrufFinanzamtESet;
		zustimmungDatenabrufFinanzamtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_FINANZAMT, oldZustimmungDatenabrufFinanzamt, zustimmungDatenabrufFinanzamt, !oldZustimmungDatenabrufFinanzamtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungDatenabrufFinanzamt() {
		boolean oldZustimmungDatenabrufFinanzamt = zustimmungDatenabrufFinanzamt;
		boolean oldZustimmungDatenabrufFinanzamtESet = zustimmungDatenabrufFinanzamtESet;
		zustimmungDatenabrufFinanzamt = ZUSTIMMUNG_DATENABRUF_FINANZAMT_EDEFAULT;
		zustimmungDatenabrufFinanzamtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_FINANZAMT, oldZustimmungDatenabrufFinanzamt, ZUSTIMMUNG_DATENABRUF_FINANZAMT_EDEFAULT, oldZustimmungDatenabrufFinanzamtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungDatenabrufFinanzamt() {
		return zustimmungDatenabrufFinanzamtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungDatenabrufBeamte() {
		return zustimmungDatenabrufBeamte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungDatenabrufBeamte(boolean newZustimmungDatenabrufBeamte) {
		boolean oldZustimmungDatenabrufBeamte = zustimmungDatenabrufBeamte;
		zustimmungDatenabrufBeamte = newZustimmungDatenabrufBeamte;
		boolean oldZustimmungDatenabrufBeamteESet = zustimmungDatenabrufBeamteESet;
		zustimmungDatenabrufBeamteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_BEAMTE, oldZustimmungDatenabrufBeamte, zustimmungDatenabrufBeamte, !oldZustimmungDatenabrufBeamteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungDatenabrufBeamte() {
		boolean oldZustimmungDatenabrufBeamte = zustimmungDatenabrufBeamte;
		boolean oldZustimmungDatenabrufBeamteESet = zustimmungDatenabrufBeamteESet;
		zustimmungDatenabrufBeamte = ZUSTIMMUNG_DATENABRUF_BEAMTE_EDEFAULT;
		zustimmungDatenabrufBeamteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_BEAMTE, oldZustimmungDatenabrufBeamte, ZUSTIMMUNG_DATENABRUF_BEAMTE_EDEFAULT, oldZustimmungDatenabrufBeamteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungDatenabrufBeamte() {
		return zustimmungDatenabrufBeamteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_DSRV:
				return isZustimmungDatenabrufDSRV();
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_STANDESAMT:
				return isZustimmungDatenabrufStandesamt();
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_KRANKENKASSE:
				return isZustimmungDatenabrufKrankenkasse();
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_FINANZAMT:
				return isZustimmungDatenabrufFinanzamt();
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_BEAMTE:
				return isZustimmungDatenabrufBeamte();
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
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_DSRV:
				setZustimmungDatenabrufDSRV((Boolean)newValue);
				return;
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_STANDESAMT:
				setZustimmungDatenabrufStandesamt((Boolean)newValue);
				return;
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_KRANKENKASSE:
				setZustimmungDatenabrufKrankenkasse((Boolean)newValue);
				return;
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_FINANZAMT:
				setZustimmungDatenabrufFinanzamt((Boolean)newValue);
				return;
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_BEAMTE:
				setZustimmungDatenabrufBeamte((Boolean)newValue);
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
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_DSRV:
				unsetZustimmungDatenabrufDSRV();
				return;
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_STANDESAMT:
				unsetZustimmungDatenabrufStandesamt();
				return;
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_KRANKENKASSE:
				unsetZustimmungDatenabrufKrankenkasse();
				return;
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_FINANZAMT:
				unsetZustimmungDatenabrufFinanzamt();
				return;
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_BEAMTE:
				unsetZustimmungDatenabrufBeamte();
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
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_DSRV:
				return isSetZustimmungDatenabrufDSRV();
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_STANDESAMT:
				return isSetZustimmungDatenabrufStandesamt();
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_KRANKENKASSE:
				return isSetZustimmungDatenabrufKrankenkasse();
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_FINANZAMT:
				return isSetZustimmungDatenabrufFinanzamt();
			case ElterngeldPackage.ZUSTIMMUNG_DATENABRUFE_TYPE__ZUSTIMMUNG_DATENABRUF_BEAMTE:
				return isSetZustimmungDatenabrufBeamte();
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
		result.append(" (zustimmungDatenabrufDSRV: ");
		if (zustimmungDatenabrufDSRVESet) result.append(zustimmungDatenabrufDSRV); else result.append("<unset>");
		result.append(", zustimmungDatenabrufStandesamt: ");
		if (zustimmungDatenabrufStandesamtESet) result.append(zustimmungDatenabrufStandesamt); else result.append("<unset>");
		result.append(", zustimmungDatenabrufKrankenkasse: ");
		if (zustimmungDatenabrufKrankenkasseESet) result.append(zustimmungDatenabrufKrankenkasse); else result.append("<unset>");
		result.append(", zustimmungDatenabrufFinanzamt: ");
		if (zustimmungDatenabrufFinanzamtESet) result.append(zustimmungDatenabrufFinanzamt); else result.append("<unset>");
		result.append(", zustimmungDatenabrufBeamte: ");
		if (zustimmungDatenabrufBeamteESet) result.append(zustimmungDatenabrufBeamte); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ZustimmungDatenabrufeTypeImpl
