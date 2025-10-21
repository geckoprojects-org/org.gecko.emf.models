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

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenEntbindungType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungRueckType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.CodeKennzeichenMutterschaftsgeldType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungRueckmeldung0502TypeImpl#getAktenzeichenElterngeldstelle <em>Aktenzeichen Elterngeldstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungRueckmeldung0502TypeImpl#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungRueckmeldung0502TypeImpl#getAngabenEntbindung <em>Angaben Entbindung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungRueckmeldung0502TypeImpl#getStornierung <em>Stornierung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.MutterschaftsgeldmeldungRueckmeldung0502TypeImpl#getKennzeichenMutterschaftsgeld <em>Kennzeichen Mutterschaftsgeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutterschaftsgeldmeldungRueckmeldung0502TypeImpl extends NachrichtTypeImpl implements MutterschaftsgeldmeldungRueckmeldung0502Type {
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
	protected AntragstellenderElternteilMutterschaftsgeldmeldungRueckType antragstellenderElternteil;

	/**
	 * The cached value of the '{@link #getAngabenEntbindung() <em>Angaben Entbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenEntbindung()
	 * @generated
	 * @ordered
	 */
	protected AngabenEntbindungType angabenEntbindung;

	/**
	 * The cached value of the '{@link #getStornierung() <em>Stornierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStornierung()
	 * @generated
	 * @ordered
	 */
	protected StornierungType stornierung;

	/**
	 * The cached value of the '{@link #getKennzeichenMutterschaftsgeld() <em>Kennzeichen Mutterschaftsgeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzeichenMutterschaftsgeld()
	 * @generated
	 * @ordered
	 */
	protected CodeKennzeichenMutterschaftsgeldType kennzeichenMutterschaftsgeld;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutterschaftsgeldmeldungRueckmeldung0502TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutterschaftsgeldPackage.Literals.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE, oldAktenzeichenElterngeldstelle, aktenzeichenElterngeldstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilMutterschaftsgeldmeldungRueckType getAntragstellenderElternteil() {
		return antragstellenderElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragstellenderElternteil(AntragstellenderElternteilMutterschaftsgeldmeldungRueckType newAntragstellenderElternteil, NotificationChain msgs) {
		AntragstellenderElternteilMutterschaftsgeldmeldungRueckType oldAntragstellenderElternteil = antragstellenderElternteil;
		antragstellenderElternteil = newAntragstellenderElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, oldAntragstellenderElternteil, newAntragstellenderElternteil);
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
	public void setAntragstellenderElternteil(AntragstellenderElternteilMutterschaftsgeldmeldungRueckType newAntragstellenderElternteil) {
		if (newAntragstellenderElternteil != antragstellenderElternteil) {
			NotificationChain msgs = null;
			if (antragstellenderElternteil != null)
				msgs = ((InternalEObject)antragstellenderElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, null, msgs);
			if (newAntragstellenderElternteil != null)
				msgs = ((InternalEObject)newAntragstellenderElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, null, msgs);
			msgs = basicSetAntragstellenderElternteil(newAntragstellenderElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, newAntragstellenderElternteil, newAntragstellenderElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenEntbindungType getAngabenEntbindung() {
		return angabenEntbindung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenEntbindung(AngabenEntbindungType newAngabenEntbindung, NotificationChain msgs) {
		AngabenEntbindungType oldAngabenEntbindung = angabenEntbindung;
		angabenEntbindung = newAngabenEntbindung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG, oldAngabenEntbindung, newAngabenEntbindung);
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
	public void setAngabenEntbindung(AngabenEntbindungType newAngabenEntbindung) {
		if (newAngabenEntbindung != angabenEntbindung) {
			NotificationChain msgs = null;
			if (angabenEntbindung != null)
				msgs = ((InternalEObject)angabenEntbindung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG, null, msgs);
			if (newAngabenEntbindung != null)
				msgs = ((InternalEObject)newAngabenEntbindung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG, null, msgs);
			msgs = basicSetAngabenEntbindung(newAngabenEntbindung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG, newAngabenEntbindung, newAngabenEntbindung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StornierungType getStornierung() {
		return stornierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStornierung(StornierungType newStornierung, NotificationChain msgs) {
		StornierungType oldStornierung = stornierung;
		stornierung = newStornierung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG, oldStornierung, newStornierung);
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
	public void setStornierung(StornierungType newStornierung) {
		if (newStornierung != stornierung) {
			NotificationChain msgs = null;
			if (stornierung != null)
				msgs = ((InternalEObject)stornierung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG, null, msgs);
			if (newStornierung != null)
				msgs = ((InternalEObject)newStornierung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG, null, msgs);
			msgs = basicSetStornierung(newStornierung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG, newStornierung, newStornierung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKennzeichenMutterschaftsgeldType getKennzeichenMutterschaftsgeld() {
		return kennzeichenMutterschaftsgeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKennzeichenMutterschaftsgeld(CodeKennzeichenMutterschaftsgeldType newKennzeichenMutterschaftsgeld, NotificationChain msgs) {
		CodeKennzeichenMutterschaftsgeldType oldKennzeichenMutterschaftsgeld = kennzeichenMutterschaftsgeld;
		kennzeichenMutterschaftsgeld = newKennzeichenMutterschaftsgeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD, oldKennzeichenMutterschaftsgeld, newKennzeichenMutterschaftsgeld);
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
	public void setKennzeichenMutterschaftsgeld(CodeKennzeichenMutterschaftsgeldType newKennzeichenMutterschaftsgeld) {
		if (newKennzeichenMutterschaftsgeld != kennzeichenMutterschaftsgeld) {
			NotificationChain msgs = null;
			if (kennzeichenMutterschaftsgeld != null)
				msgs = ((InternalEObject)kennzeichenMutterschaftsgeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD, null, msgs);
			if (newKennzeichenMutterschaftsgeld != null)
				msgs = ((InternalEObject)newKennzeichenMutterschaftsgeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD, null, msgs);
			msgs = basicSetKennzeichenMutterschaftsgeld(newKennzeichenMutterschaftsgeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD, newKennzeichenMutterschaftsgeld, newKennzeichenMutterschaftsgeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return basicSetAntragstellenderElternteil(null, msgs);
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG:
				return basicSetAngabenEntbindung(null, msgs);
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG:
				return basicSetStornierung(null, msgs);
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD:
				return basicSetKennzeichenMutterschaftsgeld(null, msgs);
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
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE:
				return getAktenzeichenElterngeldstelle();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return getAntragstellenderElternteil();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG:
				return getAngabenEntbindung();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG:
				return getStornierung();
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD:
				return getKennzeichenMutterschaftsgeld();
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
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE:
				setAktenzeichenElterngeldstelle((String)newValue);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				setAntragstellenderElternteil((AntragstellenderElternteilMutterschaftsgeldmeldungRueckType)newValue);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG:
				setAngabenEntbindung((AngabenEntbindungType)newValue);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG:
				setStornierung((StornierungType)newValue);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD:
				setKennzeichenMutterschaftsgeld((CodeKennzeichenMutterschaftsgeldType)newValue);
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
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE:
				setAktenzeichenElterngeldstelle(AKTENZEICHEN_ELTERNGELDSTELLE_EDEFAULT);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				setAntragstellenderElternteil((AntragstellenderElternteilMutterschaftsgeldmeldungRueckType)null);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG:
				setAngabenEntbindung((AngabenEntbindungType)null);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG:
				setStornierung((StornierungType)null);
				return;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD:
				setKennzeichenMutterschaftsgeld((CodeKennzeichenMutterschaftsgeldType)null);
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
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__AKTENZEICHEN_ELTERNGELDSTELLE:
				return AKTENZEICHEN_ELTERNGELDSTELLE_EDEFAULT == null ? aktenzeichenElterngeldstelle != null : !AKTENZEICHEN_ELTERNGELDSTELLE_EDEFAULT.equals(aktenzeichenElterngeldstelle);
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return antragstellenderElternteil != null;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__ANGABEN_ENTBINDUNG:
				return angabenEntbindung != null;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__STORNIERUNG:
				return stornierung != null;
			case MutterschaftsgeldPackage.MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502_TYPE__KENNZEICHEN_MUTTERSCHAFTSGELD:
				return kennzeichenMutterschaftsgeld != null;
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
		result.append(')');
		return result.toString();
	}

} //MutterschaftsgeldmeldungRueckmeldung0502TypeImpl
