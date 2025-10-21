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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutterschaftsgeldmeldung Anforderung0501 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungAnforderung0501TypeImpl#getAktenzeichenElterngeldstelle <em>Aktenzeichen Elterngeldstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungAnforderung0501TypeImpl#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungAnforderung0501TypeImpl#isEinwilligung <em>Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungAnforderung0501TypeImpl#getStornierung <em>Stornierung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutterschaftsgeldmeldungAnforderung0501TypeImpl extends NachrichtTypeImpl implements MutterschaftsgeldmeldungAnforderung0501Type {
	/**
	 * The default value of the '{@link #getAktenzeichenElterngeldstelle() <em>Aktenzeichen Elterngeldstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenElterngeldstelle()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENZEICHEN_ELTERNGELDSTELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenzeichenElterngeldstelle() <em>Aktenzeichen Elterngeldstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenElterngeldstelle()
	 * @generated
	 * @ordered
	 */
	protected String aktenzeichenElterngeldstelle = AKTENZEICHEN_ELTERNGELDSTELLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAntragstellenderElternteil() <em>Antragstellender Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragstellenderElternteil()
	 * @generated
	 * @ordered
	 */
	protected AntragstellenderElternteilMutterschaftsgeldmeldungType antragstellenderElternteil;

	/**
	 * The default value of the '{@link #isEinwilligung() <em>Einwilligung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINWILLIGUNG_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEinwilligung() <em>Einwilligung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligung()
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligung = EINWILLIGUNG_EDEFAULT;

	/**
	 * This is true if the Einwilligung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungESet;

	/**
	 * The cached value of the '{@link #getStornierung() <em>Stornierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStornierung()
	 * @generated
	 * @ordered
	 */
	protected StornierungType1 stornierung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutterschaftsgeldmeldungAnforderung0501TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutterschaftsgeldPackage.Literals.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenzeichenElterngeldstelle() {
		return aktenzeichenElterngeldstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenzeichenElterngeldstelle(String newAktenzeichenElterngeldstelle) {
		String oldAktenzeichenElterngeldstelle = aktenzeichenElterngeldstelle;
		aktenzeichenElterngeldstelle = newAktenzeichenElterngeldstelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE, oldAktenzeichenElterngeldstelle, aktenzeichenElterngeldstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilMutterschaftsgeldmeldungType getAntragstellenderElternteil() {
		return antragstellenderElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragstellenderElternteil(AntragstellenderElternteilMutterschaftsgeldmeldungType newAntragstellenderElternteil, NotificationChain msgs) {
		AntragstellenderElternteilMutterschaftsgeldmeldungType oldAntragstellenderElternteil = antragstellenderElternteil;
		antragstellenderElternteil = newAntragstellenderElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, oldAntragstellenderElternteil, newAntragstellenderElternteil);
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
	public void setAntragstellenderElternteil(AntragstellenderElternteilMutterschaftsgeldmeldungType newAntragstellenderElternteil) {
		if (newAntragstellenderElternteil != antragstellenderElternteil) {
			NotificationChain msgs = null;
			if (antragstellenderElternteil != null)
				msgs = ((InternalEObject)antragstellenderElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, null, msgs);
			if (newAntragstellenderElternteil != null)
				msgs = ((InternalEObject)newAntragstellenderElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, null, msgs);
			msgs = basicSetAntragstellenderElternteil(newAntragstellenderElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, newAntragstellenderElternteil, newAntragstellenderElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinwilligung() {
		return einwilligung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinwilligung(boolean newEinwilligung) {
		boolean oldEinwilligung = einwilligung;
		einwilligung = newEinwilligung;
		boolean oldEinwilligungESet = einwilligungESet;
		einwilligungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__EINWILLIGUNG, oldEinwilligung, einwilligung, !oldEinwilligungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinwilligung() {
		boolean oldEinwilligung = einwilligung;
		boolean oldEinwilligungESet = einwilligungESet;
		einwilligung = EINWILLIGUNG_EDEFAULT;
		einwilligungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__EINWILLIGUNG, oldEinwilligung, EINWILLIGUNG_EDEFAULT, oldEinwilligungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinwilligung() {
		return einwilligungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StornierungType1 getStornierung() {
		return stornierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStornierung(StornierungType1 newStornierung, NotificationChain msgs) {
		StornierungType1 oldStornierung = stornierung;
		stornierung = newStornierung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG, oldStornierung, newStornierung);
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
	public void setStornierung(StornierungType1 newStornierung) {
		if (newStornierung != stornierung) {
			NotificationChain msgs = null;
			if (stornierung != null)
				msgs = ((InternalEObject)stornierung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG, null, msgs);
			if (newStornierung != null)
				msgs = ((InternalEObject)newStornierung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG, null, msgs);
			msgs = basicSetStornierung(newStornierung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG, newStornierung, newStornierung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return basicSetAntragstellenderElternteil(null, msgs);
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG:
				return basicSetStornierung(null, msgs);
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
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE:
				return getAktenzeichenElterngeldstelle();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return getAntragstellenderElternteil();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__EINWILLIGUNG:
				return isEinwilligung();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG:
				return getStornierung();
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
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE:
				setAktenzeichenElterngeldstelle((String)newValue);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				setAntragstellenderElternteil((AntragstellenderElternteilMutterschaftsgeldmeldungType)newValue);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__EINWILLIGUNG:
				setEinwilligung((Boolean)newValue);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG:
				setStornierung((StornierungType1)newValue);
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
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE:
				setAktenzeichenElterngeldstelle(AKTENZEICHEN_ELTERNGELDSTELLE_EDEFAULT);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				setAntragstellenderElternteil((AntragstellenderElternteilMutterschaftsgeldmeldungType)null);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__EINWILLIGUNG:
				unsetEinwilligung();
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG:
				setStornierung((StornierungType1)null);
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
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE:
				return AKTENZEICHEN_ELTERNGELDSTELLE_EDEFAULT == null ? aktenzeichenElterngeldstelle != null : !AKTENZEICHEN_ELTERNGELDSTELLE_EDEFAULT.equals(aktenzeichenElterngeldstelle);
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return antragstellenderElternteil != null;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__EINWILLIGUNG:
				return isSetEinwilligung();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501_TYPE__STORNIERUNG:
				return stornierung != null;
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
		result.append(" (aktenzeichenElterngeldstelle: ");
		result.append(aktenzeichenElterngeldstelle);
		result.append(", einwilligung: ");
		if (einwilligungESet) result.append(einwilligung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MutterschaftsgeldmeldungAnforderung0501TypeImpl
