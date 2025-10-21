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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSonstigeLeistungenUVType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sonstige Leistung Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungAndererElternteilTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungAndererElternteilTypeImpl#getNameLeistungsstelle <em>Name Leistungsstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungAndererElternteilTypeImpl#getBedarfsgemeinschaftsnummer <em>Bedarfsgemeinschaftsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungAndererElternteilTypeImpl#getRentenversicherungsnummer <em>Rentenversicherungsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SonstigeLeistungAndererElternteilTypeImpl#getBetraegeZurLeistungshoehe <em>Betraege Zur Leistungshoehe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SonstigeLeistungAndererElternteilTypeImpl extends MinimalEObjectImpl.Container implements SonstigeLeistungAndererElternteilType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeSonstigeLeistungenUVType art;

	/**
	 * The default value of the '{@link #getNameLeistungsstelle() <em>Name Leistungsstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameLeistungsstelle()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_LEISTUNGSSTELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameLeistungsstelle() <em>Name Leistungsstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameLeistungsstelle()
	 * @generated
	 * @ordered
	 */
	protected String nameLeistungsstelle = NAME_LEISTUNGSSTELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBedarfsgemeinschaftsnummer() <em>Bedarfsgemeinschaftsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedarfsgemeinschaftsnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBedarfsgemeinschaftsnummer() <em>Bedarfsgemeinschaftsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedarfsgemeinschaftsnummer()
	 * @generated
	 * @ordered
	 */
	protected String bedarfsgemeinschaftsnummer = BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRentenversicherungsnummer() <em>Rentenversicherungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentenversicherungsnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String RENTENVERSICHERUNGSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRentenversicherungsnummer() <em>Rentenversicherungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentenversicherungsnummer()
	 * @generated
	 * @ordered
	 */
	protected String rentenversicherungsnummer = RENTENVERSICHERUNGSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBetraegeZurLeistungshoehe() <em>Betraege Zur Leistungshoehe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetraegeZurLeistungshoehe()
	 * @generated
	 * @ordered
	 */
	protected static final String BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetraegeZurLeistungshoehe() <em>Betraege Zur Leistungshoehe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetraegeZurLeistungshoehe()
	 * @generated
	 * @ordered
	 */
	protected String betraegeZurLeistungshoehe = BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SonstigeLeistungAndererElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getSonstigeLeistungAndererElternteilType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSonstigeLeistungenUVType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeSonstigeLeistungenUVType newArt, NotificationChain msgs) {
		CodeSonstigeLeistungenUVType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeSonstigeLeistungenUVType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameLeistungsstelle() {
		return nameLeistungsstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameLeistungsstelle(String newNameLeistungsstelle) {
		String oldNameLeistungsstelle = nameLeistungsstelle;
		nameLeistungsstelle = newNameLeistungsstelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__NAME_LEISTUNGSSTELLE, oldNameLeistungsstelle, nameLeistungsstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBedarfsgemeinschaftsnummer() {
		return bedarfsgemeinschaftsnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBedarfsgemeinschaftsnummer(String newBedarfsgemeinschaftsnummer) {
		String oldBedarfsgemeinschaftsnummer = bedarfsgemeinschaftsnummer;
		bedarfsgemeinschaftsnummer = newBedarfsgemeinschaftsnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BEDARFSGEMEINSCHAFTSNUMMER, oldBedarfsgemeinschaftsnummer, bedarfsgemeinschaftsnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRentenversicherungsnummer() {
		return rentenversicherungsnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRentenversicherungsnummer(String newRentenversicherungsnummer) {
		String oldRentenversicherungsnummer = rentenversicherungsnummer;
		rentenversicherungsnummer = newRentenversicherungsnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__RENTENVERSICHERUNGSNUMMER, oldRentenversicherungsnummer, rentenversicherungsnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBetraegeZurLeistungshoehe() {
		return betraegeZurLeistungshoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetraegeZurLeistungshoehe(String newBetraegeZurLeistungshoehe) {
		String oldBetraegeZurLeistungshoehe = betraegeZurLeistungshoehe;
		betraegeZurLeistungshoehe = newBetraegeZurLeistungshoehe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE, oldBetraegeZurLeistungshoehe, betraegeZurLeistungshoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART:
				return basicSetArt(null, msgs);
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
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__NAME_LEISTUNGSSTELLE:
				return getNameLeistungsstelle();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BEDARFSGEMEINSCHAFTSNUMMER:
				return getBedarfsgemeinschaftsnummer();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__RENTENVERSICHERUNGSNUMMER:
				return getRentenversicherungsnummer();
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE:
				return getBetraegeZurLeistungshoehe();
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
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART:
				setArt((CodeSonstigeLeistungenUVType)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__NAME_LEISTUNGSSTELLE:
				setNameLeistungsstelle((String)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BEDARFSGEMEINSCHAFTSNUMMER:
				setBedarfsgemeinschaftsnummer((String)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__RENTENVERSICHERUNGSNUMMER:
				setRentenversicherungsnummer((String)newValue);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE:
				setBetraegeZurLeistungshoehe((String)newValue);
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
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART:
				setArt((CodeSonstigeLeistungenUVType)null);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__NAME_LEISTUNGSSTELLE:
				setNameLeistungsstelle(NAME_LEISTUNGSSTELLE_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BEDARFSGEMEINSCHAFTSNUMMER:
				setBedarfsgemeinschaftsnummer(BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__RENTENVERSICHERUNGSNUMMER:
				setRentenversicherungsnummer(RENTENVERSICHERUNGSNUMMER_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE:
				setBetraegeZurLeistungshoehe(BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT);
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
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__NAME_LEISTUNGSSTELLE:
				return NAME_LEISTUNGSSTELLE_EDEFAULT == null ? nameLeistungsstelle != null : !NAME_LEISTUNGSSTELLE_EDEFAULT.equals(nameLeistungsstelle);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BEDARFSGEMEINSCHAFTSNUMMER:
				return BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT == null ? bedarfsgemeinschaftsnummer != null : !BEDARFSGEMEINSCHAFTSNUMMER_EDEFAULT.equals(bedarfsgemeinschaftsnummer);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__RENTENVERSICHERUNGSNUMMER:
				return RENTENVERSICHERUNGSNUMMER_EDEFAULT == null ? rentenversicherungsnummer != null : !RENTENVERSICHERUNGSNUMMER_EDEFAULT.equals(rentenversicherungsnummer);
			case UnterhaltsvorschussPackage.SONSTIGE_LEISTUNG_ANDERER_ELTERNTEIL_TYPE__BETRAEGE_ZUR_LEISTUNGSHOEHE:
				return BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT == null ? betraegeZurLeistungshoehe != null : !BETRAEGE_ZUR_LEISTUNGSHOEHE_EDEFAULT.equals(betraegeZurLeistungshoehe);
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
		result.append(" (nameLeistungsstelle: ");
		result.append(nameLeistungsstelle);
		result.append(", bedarfsgemeinschaftsnummer: ");
		result.append(bedarfsgemeinschaftsnummer);
		result.append(", rentenversicherungsnummer: ");
		result.append(rentenversicherungsnummer);
		result.append(", betraegeZurLeistungshoehe: ");
		result.append(betraegeZurLeistungshoehe);
		result.append(')');
		return result.toString();
	}

} //SonstigeLeistungAndererElternteilTypeImpl
