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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Art Der Behandlung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl#getArtDerBehandlung <em>Art Der Behandlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl#getNummerDesBehandlungszyklus <em>Nummer Des Behandlungszyklus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl#isVollstaendigeDurchfuehrungBehandlung <em>Vollstaendige Durchfuehrung Behandlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl#isSchwangerschaftEingetreten <em>Schwangerschaft Eingetreten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl#getNummerBehandlungszyklus <em>Nummer Behandlungszyklus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl#isBestaetigungBehandlungNnichtBegonnen <em>Bestaetigung Behandlung Nnicht Begonnen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl#getVoraussichtlicherBehandlungsbeginn <em>Voraussichtlicher Behandlungsbeginn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtDerBehandlungTypeImpl extends MinimalEObjectImpl.Container implements ArtDerBehandlungType {
	/**
	 * The default value of the '{@link #getArtDerBehandlung() <em>Art Der Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtDerBehandlung()
	 * @generated
	 * @ordered
	 */
	protected static final String ART_DER_BEHANDLUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtDerBehandlung() <em>Art Der Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtDerBehandlung()
	 * @generated
	 * @ordered
	 */
	protected String artDerBehandlung = ART_DER_BEHANDLUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNummerDesBehandlungszyklus() <em>Nummer Des Behandlungszyklus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerDesBehandlungszyklus()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMMER_DES_BEHANDLUNGSZYKLUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNummerDesBehandlungszyklus() <em>Nummer Des Behandlungszyklus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerDesBehandlungszyklus()
	 * @generated
	 * @ordered
	 */
	protected String nummerDesBehandlungszyklus = NUMMER_DES_BEHANDLUNGSZYKLUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isVollstaendigeDurchfuehrungBehandlung() <em>Vollstaendige Durchfuehrung Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVollstaendigeDurchfuehrungBehandlung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVollstaendigeDurchfuehrungBehandlung() <em>Vollstaendige Durchfuehrung Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVollstaendigeDurchfuehrungBehandlung()
	 * @generated
	 * @ordered
	 */
	protected boolean vollstaendigeDurchfuehrungBehandlung = VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG_EDEFAULT;

	/**
	 * This is true if the Vollstaendige Durchfuehrung Behandlung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vollstaendigeDurchfuehrungBehandlungESet;

	/**
	 * The default value of the '{@link #isSchwangerschaftEingetreten() <em>Schwangerschaft Eingetreten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSchwangerschaftEingetreten()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCHWANGERSCHAFT_EINGETRETEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSchwangerschaftEingetreten() <em>Schwangerschaft Eingetreten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSchwangerschaftEingetreten()
	 * @generated
	 * @ordered
	 */
	protected boolean schwangerschaftEingetreten = SCHWANGERSCHAFT_EINGETRETEN_EDEFAULT;

	/**
	 * This is true if the Schwangerschaft Eingetreten attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schwangerschaftEingetretenESet;

	/**
	 * The default value of the '{@link #getNummerBehandlungszyklus() <em>Nummer Behandlungszyklus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerBehandlungszyklus()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMMER_BEHANDLUNGSZYKLUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNummerBehandlungszyklus() <em>Nummer Behandlungszyklus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerBehandlungszyklus()
	 * @generated
	 * @ordered
	 */
	protected String nummerBehandlungszyklus = NUMMER_BEHANDLUNGSZYKLUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isBestaetigungBehandlungNnichtBegonnen() <em>Bestaetigung Behandlung Nnicht Begonnen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBestaetigungBehandlungNnichtBegonnen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBestaetigungBehandlungNnichtBegonnen() <em>Bestaetigung Behandlung Nnicht Begonnen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBestaetigungBehandlungNnichtBegonnen()
	 * @generated
	 * @ordered
	 */
	protected boolean bestaetigungBehandlungNnichtBegonnen = BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN_EDEFAULT;

	/**
	 * This is true if the Bestaetigung Behandlung Nnicht Begonnen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestaetigungBehandlungNnichtBegonnenESet;

	/**
	 * The default value of the '{@link #getVoraussichtlicherBehandlungsbeginn() <em>Voraussichtlicher Behandlungsbeginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicherBehandlungsbeginn()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VORAUSSICHTLICHER_BEHANDLUNGSBEGINN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoraussichtlicherBehandlungsbeginn() <em>Voraussichtlicher Behandlungsbeginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicherBehandlungsbeginn()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar voraussichtlicherBehandlungsbeginn = VORAUSSICHTLICHER_BEHANDLUNGSBEGINN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtDerBehandlungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.ART_DER_BEHANDLUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtDerBehandlung() {
		return artDerBehandlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtDerBehandlung(String newArtDerBehandlung) {
		String oldArtDerBehandlung = artDerBehandlung;
		artDerBehandlung = newArtDerBehandlung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__ART_DER_BEHANDLUNG, oldArtDerBehandlung, artDerBehandlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNummerDesBehandlungszyklus() {
		return nummerDesBehandlungszyklus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNummerDesBehandlungszyklus(String newNummerDesBehandlungszyklus) {
		String oldNummerDesBehandlungszyklus = nummerDesBehandlungszyklus;
		nummerDesBehandlungszyklus = newNummerDesBehandlungszyklus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_DES_BEHANDLUNGSZYKLUS, oldNummerDesBehandlungszyklus, nummerDesBehandlungszyklus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVollstaendigeDurchfuehrungBehandlung() {
		return vollstaendigeDurchfuehrungBehandlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVollstaendigeDurchfuehrungBehandlung(boolean newVollstaendigeDurchfuehrungBehandlung) {
		boolean oldVollstaendigeDurchfuehrungBehandlung = vollstaendigeDurchfuehrungBehandlung;
		vollstaendigeDurchfuehrungBehandlung = newVollstaendigeDurchfuehrungBehandlung;
		boolean oldVollstaendigeDurchfuehrungBehandlungESet = vollstaendigeDurchfuehrungBehandlungESet;
		vollstaendigeDurchfuehrungBehandlungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG, oldVollstaendigeDurchfuehrungBehandlung, vollstaendigeDurchfuehrungBehandlung, !oldVollstaendigeDurchfuehrungBehandlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVollstaendigeDurchfuehrungBehandlung() {
		boolean oldVollstaendigeDurchfuehrungBehandlung = vollstaendigeDurchfuehrungBehandlung;
		boolean oldVollstaendigeDurchfuehrungBehandlungESet = vollstaendigeDurchfuehrungBehandlungESet;
		vollstaendigeDurchfuehrungBehandlung = VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG_EDEFAULT;
		vollstaendigeDurchfuehrungBehandlungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG, oldVollstaendigeDurchfuehrungBehandlung, VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG_EDEFAULT, oldVollstaendigeDurchfuehrungBehandlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVollstaendigeDurchfuehrungBehandlung() {
		return vollstaendigeDurchfuehrungBehandlungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSchwangerschaftEingetreten() {
		return schwangerschaftEingetreten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchwangerschaftEingetreten(boolean newSchwangerschaftEingetreten) {
		boolean oldSchwangerschaftEingetreten = schwangerschaftEingetreten;
		schwangerschaftEingetreten = newSchwangerschaftEingetreten;
		boolean oldSchwangerschaftEingetretenESet = schwangerschaftEingetretenESet;
		schwangerschaftEingetretenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__SCHWANGERSCHAFT_EINGETRETEN, oldSchwangerschaftEingetreten, schwangerschaftEingetreten, !oldSchwangerschaftEingetretenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSchwangerschaftEingetreten() {
		boolean oldSchwangerschaftEingetreten = schwangerschaftEingetreten;
		boolean oldSchwangerschaftEingetretenESet = schwangerschaftEingetretenESet;
		schwangerschaftEingetreten = SCHWANGERSCHAFT_EINGETRETEN_EDEFAULT;
		schwangerschaftEingetretenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__SCHWANGERSCHAFT_EINGETRETEN, oldSchwangerschaftEingetreten, SCHWANGERSCHAFT_EINGETRETEN_EDEFAULT, oldSchwangerschaftEingetretenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSchwangerschaftEingetreten() {
		return schwangerschaftEingetretenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNummerBehandlungszyklus() {
		return nummerBehandlungszyklus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNummerBehandlungszyklus(String newNummerBehandlungszyklus) {
		String oldNummerBehandlungszyklus = nummerBehandlungszyklus;
		nummerBehandlungszyklus = newNummerBehandlungszyklus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_BEHANDLUNGSZYKLUS, oldNummerBehandlungszyklus, nummerBehandlungszyklus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBestaetigungBehandlungNnichtBegonnen() {
		return bestaetigungBehandlungNnichtBegonnen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBestaetigungBehandlungNnichtBegonnen(boolean newBestaetigungBehandlungNnichtBegonnen) {
		boolean oldBestaetigungBehandlungNnichtBegonnen = bestaetigungBehandlungNnichtBegonnen;
		bestaetigungBehandlungNnichtBegonnen = newBestaetigungBehandlungNnichtBegonnen;
		boolean oldBestaetigungBehandlungNnichtBegonnenESet = bestaetigungBehandlungNnichtBegonnenESet;
		bestaetigungBehandlungNnichtBegonnenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN, oldBestaetigungBehandlungNnichtBegonnen, bestaetigungBehandlungNnichtBegonnen, !oldBestaetigungBehandlungNnichtBegonnenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBestaetigungBehandlungNnichtBegonnen() {
		boolean oldBestaetigungBehandlungNnichtBegonnen = bestaetigungBehandlungNnichtBegonnen;
		boolean oldBestaetigungBehandlungNnichtBegonnenESet = bestaetigungBehandlungNnichtBegonnenESet;
		bestaetigungBehandlungNnichtBegonnen = BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN_EDEFAULT;
		bestaetigungBehandlungNnichtBegonnenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN, oldBestaetigungBehandlungNnichtBegonnen, BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN_EDEFAULT, oldBestaetigungBehandlungNnichtBegonnenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBestaetigungBehandlungNnichtBegonnen() {
		return bestaetigungBehandlungNnichtBegonnenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getVoraussichtlicherBehandlungsbeginn() {
		return voraussichtlicherBehandlungsbeginn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoraussichtlicherBehandlungsbeginn(XMLGregorianCalendar newVoraussichtlicherBehandlungsbeginn) {
		XMLGregorianCalendar oldVoraussichtlicherBehandlungsbeginn = voraussichtlicherBehandlungsbeginn;
		voraussichtlicherBehandlungsbeginn = newVoraussichtlicherBehandlungsbeginn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VORAUSSICHTLICHER_BEHANDLUNGSBEGINN, oldVoraussichtlicherBehandlungsbeginn, voraussichtlicherBehandlungsbeginn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__ART_DER_BEHANDLUNG:
				return getArtDerBehandlung();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_DES_BEHANDLUNGSZYKLUS:
				return getNummerDesBehandlungszyklus();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG:
				return isVollstaendigeDurchfuehrungBehandlung();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__SCHWANGERSCHAFT_EINGETRETEN:
				return isSchwangerschaftEingetreten();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_BEHANDLUNGSZYKLUS:
				return getNummerBehandlungszyklus();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN:
				return isBestaetigungBehandlungNnichtBegonnen();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VORAUSSICHTLICHER_BEHANDLUNGSBEGINN:
				return getVoraussichtlicherBehandlungsbeginn();
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
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__ART_DER_BEHANDLUNG:
				setArtDerBehandlung((String)newValue);
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_DES_BEHANDLUNGSZYKLUS:
				setNummerDesBehandlungszyklus((String)newValue);
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG:
				setVollstaendigeDurchfuehrungBehandlung((Boolean)newValue);
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__SCHWANGERSCHAFT_EINGETRETEN:
				setSchwangerschaftEingetreten((Boolean)newValue);
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_BEHANDLUNGSZYKLUS:
				setNummerBehandlungszyklus((String)newValue);
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN:
				setBestaetigungBehandlungNnichtBegonnen((Boolean)newValue);
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VORAUSSICHTLICHER_BEHANDLUNGSBEGINN:
				setVoraussichtlicherBehandlungsbeginn((XMLGregorianCalendar)newValue);
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
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__ART_DER_BEHANDLUNG:
				setArtDerBehandlung(ART_DER_BEHANDLUNG_EDEFAULT);
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_DES_BEHANDLUNGSZYKLUS:
				setNummerDesBehandlungszyklus(NUMMER_DES_BEHANDLUNGSZYKLUS_EDEFAULT);
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG:
				unsetVollstaendigeDurchfuehrungBehandlung();
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__SCHWANGERSCHAFT_EINGETRETEN:
				unsetSchwangerschaftEingetreten();
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_BEHANDLUNGSZYKLUS:
				setNummerBehandlungszyklus(NUMMER_BEHANDLUNGSZYKLUS_EDEFAULT);
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN:
				unsetBestaetigungBehandlungNnichtBegonnen();
				return;
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VORAUSSICHTLICHER_BEHANDLUNGSBEGINN:
				setVoraussichtlicherBehandlungsbeginn(VORAUSSICHTLICHER_BEHANDLUNGSBEGINN_EDEFAULT);
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
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__ART_DER_BEHANDLUNG:
				return ART_DER_BEHANDLUNG_EDEFAULT == null ? artDerBehandlung != null : !ART_DER_BEHANDLUNG_EDEFAULT.equals(artDerBehandlung);
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_DES_BEHANDLUNGSZYKLUS:
				return NUMMER_DES_BEHANDLUNGSZYKLUS_EDEFAULT == null ? nummerDesBehandlungszyklus != null : !NUMMER_DES_BEHANDLUNGSZYKLUS_EDEFAULT.equals(nummerDesBehandlungszyklus);
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG:
				return isSetVollstaendigeDurchfuehrungBehandlung();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__SCHWANGERSCHAFT_EINGETRETEN:
				return isSetSchwangerschaftEingetreten();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__NUMMER_BEHANDLUNGSZYKLUS:
				return NUMMER_BEHANDLUNGSZYKLUS_EDEFAULT == null ? nummerBehandlungszyklus != null : !NUMMER_BEHANDLUNGSZYKLUS_EDEFAULT.equals(nummerBehandlungszyklus);
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN:
				return isSetBestaetigungBehandlungNnichtBegonnen();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE__VORAUSSICHTLICHER_BEHANDLUNGSBEGINN:
				return VORAUSSICHTLICHER_BEHANDLUNGSBEGINN_EDEFAULT == null ? voraussichtlicherBehandlungsbeginn != null : !VORAUSSICHTLICHER_BEHANDLUNGSBEGINN_EDEFAULT.equals(voraussichtlicherBehandlungsbeginn);
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
		result.append(" (artDerBehandlung: ");
		result.append(artDerBehandlung);
		result.append(", nummerDesBehandlungszyklus: ");
		result.append(nummerDesBehandlungszyklus);
		result.append(", vollstaendigeDurchfuehrungBehandlung: ");
		if (vollstaendigeDurchfuehrungBehandlungESet) result.append(vollstaendigeDurchfuehrungBehandlung); else result.append("<unset>");
		result.append(", schwangerschaftEingetreten: ");
		if (schwangerschaftEingetretenESet) result.append(schwangerschaftEingetreten); else result.append("<unset>");
		result.append(", nummerBehandlungszyklus: ");
		result.append(nummerBehandlungszyklus);
		result.append(", bestaetigungBehandlungNnichtBegonnen: ");
		if (bestaetigungBehandlungNnichtBegonnenESet) result.append(bestaetigungBehandlungNnichtBegonnen); else result.append("<unset>");
		result.append(", voraussichtlicherBehandlungsbeginn: ");
		result.append(voraussichtlicherBehandlungsbeginn);
		result.append(')');
		return result.toString();
	}

} //ArtDerBehandlungTypeImpl
