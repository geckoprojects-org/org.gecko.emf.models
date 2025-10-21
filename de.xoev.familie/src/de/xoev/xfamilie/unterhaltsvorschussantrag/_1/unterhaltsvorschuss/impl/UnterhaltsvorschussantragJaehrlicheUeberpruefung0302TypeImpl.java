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

import de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilUeberpruefungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragskindUeberpruefungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AntragstellenderElternteilUeberpruefungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BestaetigungAngabenType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltUeberpruefungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#getGesamtZahlDerNachrichten <em>Gesamt Zahl Der Nachrichten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#getAntragskind <em>Antragskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#getAndererElternteil <em>Anderer Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#getUnterhalt <em>Unterhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#getDatenabruf <em>Datenabruf</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#getPdfAntrag <em>Pdf Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#isArtSignaturDigital <em>Art Signatur Digital</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#getBestaetigungAngaben <em>Bestaetigung Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl#isMerkblattUVG <em>Merkblatt UVG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl extends AntragsnachrichtTypeImpl implements UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type {
	/**
	 * The default value of the '{@link #getGesamtZahlDerNachrichten() <em>Gesamt Zahl Der Nachrichten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamtZahlDerNachrichten()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGesamtZahlDerNachrichten() <em>Gesamt Zahl Der Nachrichten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamtZahlDerNachrichten()
	 * @generated
	 * @ordered
	 */
	protected BigInteger gesamtZahlDerNachrichten = GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAntragskind() <em>Antragskind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragskind()
	 * @generated
	 * @ordered
	 */
	protected AntragskindUeberpruefungType antragskind;

	/**
	 * The cached value of the '{@link #getAntragstellenderElternteil() <em>Antragstellender Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragstellenderElternteil()
	 * @generated
	 * @ordered
	 */
	protected AntragstellenderElternteilUeberpruefungType antragstellenderElternteil;

	/**
	 * The cached value of the '{@link #getAndererElternteil() <em>Anderer Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndererElternteil()
	 * @generated
	 * @ordered
	 */
	protected AndererElternteilUeberpruefungType andererElternteil;

	/**
	 * The cached value of the '{@link #getUnterhalt() <em>Unterhalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhalt()
	 * @generated
	 * @ordered
	 */
	protected UnterhaltUeberpruefungType unterhalt;

	/**
	 * The cached value of the '{@link #getDatenabruf() <em>Datenabruf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenabruf()
	 * @generated
	 * @ordered
	 */
	protected DatenabrufType datenabruf;

	/**
	 * The cached value of the '{@link #getPdfAntrag() <em>Pdf Antrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdfAntrag()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType pdfAntrag;

	/**
	 * The default value of the '{@link #isWartenAufUnterschrift() <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWartenAufUnterschrift()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WARTEN_AUF_UNTERSCHRIFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWartenAufUnterschrift() <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWartenAufUnterschrift()
	 * @generated
	 * @ordered
	 */
	protected boolean wartenAufUnterschrift = WARTEN_AUF_UNTERSCHRIFT_EDEFAULT;

	/**
	 * This is true if the Warten Auf Unterschrift attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wartenAufUnterschriftESet;

	/**
	 * The cached value of the '{@link #getDsgvo() <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgvo()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzerklaerungenType dsgvo;

	/**
	 * The default value of the '{@link #isArtSignaturDigital() <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArtSignaturDigital()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ART_SIGNATUR_DIGITAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArtSignaturDigital() <em>Art Signatur Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArtSignaturDigital()
	 * @generated
	 * @ordered
	 */
	protected boolean artSignaturDigital = ART_SIGNATUR_DIGITAL_EDEFAULT;

	/**
	 * This is true if the Art Signatur Digital attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean artSignaturDigitalESet;

	/**
	 * The cached value of the '{@link #getBestaetigungAngaben() <em>Bestaetigung Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestaetigungAngaben()
	 * @generated
	 * @ordered
	 */
	protected BestaetigungAngabenType bestaetigungAngaben;

	/**
	 * The default value of the '{@link #isMerkblattUVG() <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerkblattUVG()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERKBLATT_UVG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMerkblattUVG() <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerkblattUVG()
	 * @generated
	 * @ordered
	 */
	protected boolean merkblattUVG = MERKBLATT_UVG_EDEFAULT;

	/**
	 * This is true if the Merkblatt UVG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean merkblattUVGESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getGesamtZahlDerNachrichten() {
		return gesamtZahlDerNachrichten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGesamtZahlDerNachrichten(BigInteger newGesamtZahlDerNachrichten) {
		BigInteger oldGesamtZahlDerNachrichten = gesamtZahlDerNachrichten;
		gesamtZahlDerNachrichten = newGesamtZahlDerNachrichten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN, oldGesamtZahlDerNachrichten, gesamtZahlDerNachrichten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragskindUeberpruefungType getAntragskind() {
		return antragskind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragskind(AntragskindUeberpruefungType newAntragskind, NotificationChain msgs) {
		AntragskindUeberpruefungType oldAntragskind = antragskind;
		antragskind = newAntragskind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND, oldAntragskind, newAntragskind);
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
	public void setAntragskind(AntragskindUeberpruefungType newAntragskind) {
		if (newAntragskind != antragskind) {
			NotificationChain msgs = null;
			if (antragskind != null)
				msgs = ((InternalEObject)antragskind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND, null, msgs);
			if (newAntragskind != null)
				msgs = ((InternalEObject)newAntragskind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND, null, msgs);
			msgs = basicSetAntragskind(newAntragskind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND, newAntragskind, newAntragskind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilUeberpruefungType getAntragstellenderElternteil() {
		return antragstellenderElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragstellenderElternteil(AntragstellenderElternteilUeberpruefungType newAntragstellenderElternteil, NotificationChain msgs) {
		AntragstellenderElternteilUeberpruefungType oldAntragstellenderElternteil = antragstellenderElternteil;
		antragstellenderElternteil = newAntragstellenderElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, oldAntragstellenderElternteil, newAntragstellenderElternteil);
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
	public void setAntragstellenderElternteil(AntragstellenderElternteilUeberpruefungType newAntragstellenderElternteil) {
		if (newAntragstellenderElternteil != antragstellenderElternteil) {
			NotificationChain msgs = null;
			if (antragstellenderElternteil != null)
				msgs = ((InternalEObject)antragstellenderElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, null, msgs);
			if (newAntragstellenderElternteil != null)
				msgs = ((InternalEObject)newAntragstellenderElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, null, msgs);
			msgs = basicSetAntragstellenderElternteil(newAntragstellenderElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, newAntragstellenderElternteil, newAntragstellenderElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndererElternteilUeberpruefungType getAndererElternteil() {
		return andererElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAndererElternteil(AndererElternteilUeberpruefungType newAndererElternteil, NotificationChain msgs) {
		AndererElternteilUeberpruefungType oldAndererElternteil = andererElternteil;
		andererElternteil = newAndererElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL, oldAndererElternteil, newAndererElternteil);
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
	public void setAndererElternteil(AndererElternteilUeberpruefungType newAndererElternteil) {
		if (newAndererElternteil != andererElternteil) {
			NotificationChain msgs = null;
			if (andererElternteil != null)
				msgs = ((InternalEObject)andererElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL, null, msgs);
			if (newAndererElternteil != null)
				msgs = ((InternalEObject)newAndererElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL, null, msgs);
			msgs = basicSetAndererElternteil(newAndererElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL, newAndererElternteil, newAndererElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltUeberpruefungType getUnterhalt() {
		return unterhalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterhalt(UnterhaltUeberpruefungType newUnterhalt, NotificationChain msgs) {
		UnterhaltUeberpruefungType oldUnterhalt = unterhalt;
		unterhalt = newUnterhalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT, oldUnterhalt, newUnterhalt);
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
	public void setUnterhalt(UnterhaltUeberpruefungType newUnterhalt) {
		if (newUnterhalt != unterhalt) {
			NotificationChain msgs = null;
			if (unterhalt != null)
				msgs = ((InternalEObject)unterhalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT, null, msgs);
			if (newUnterhalt != null)
				msgs = ((InternalEObject)newUnterhalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT, null, msgs);
			msgs = basicSetUnterhalt(newUnterhalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT, newUnterhalt, newUnterhalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenabrufType getDatenabruf() {
		return datenabruf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenabruf(DatenabrufType newDatenabruf, NotificationChain msgs) {
		DatenabrufType oldDatenabruf = datenabruf;
		datenabruf = newDatenabruf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF, oldDatenabruf, newDatenabruf);
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
	public void setDatenabruf(DatenabrufType newDatenabruf) {
		if (newDatenabruf != datenabruf) {
			NotificationChain msgs = null;
			if (datenabruf != null)
				msgs = ((InternalEObject)datenabruf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF, null, msgs);
			if (newDatenabruf != null)
				msgs = ((InternalEObject)newDatenabruf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF, null, msgs);
			msgs = basicSetDatenabruf(newDatenabruf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF, newDatenabruf, newDatenabruf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getPdfAntrag() {
		return pdfAntrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPdfAntrag(NachweisdokumentType newPdfAntrag, NotificationChain msgs) {
		NachweisdokumentType oldPdfAntrag = pdfAntrag;
		pdfAntrag = newPdfAntrag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG, oldPdfAntrag, newPdfAntrag);
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
	public void setPdfAntrag(NachweisdokumentType newPdfAntrag) {
		if (newPdfAntrag != pdfAntrag) {
			NotificationChain msgs = null;
			if (pdfAntrag != null)
				msgs = ((InternalEObject)pdfAntrag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG, null, msgs);
			if (newPdfAntrag != null)
				msgs = ((InternalEObject)newPdfAntrag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG, null, msgs);
			msgs = basicSetPdfAntrag(newPdfAntrag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG, newPdfAntrag, newPdfAntrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWartenAufUnterschrift() {
		return wartenAufUnterschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWartenAufUnterschrift(boolean newWartenAufUnterschrift) {
		boolean oldWartenAufUnterschrift = wartenAufUnterschrift;
		wartenAufUnterschrift = newWartenAufUnterschrift;
		boolean oldWartenAufUnterschriftESet = wartenAufUnterschriftESet;
		wartenAufUnterschriftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__WARTEN_AUF_UNTERSCHRIFT, oldWartenAufUnterschrift, wartenAufUnterschrift, !oldWartenAufUnterschriftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWartenAufUnterschrift() {
		boolean oldWartenAufUnterschrift = wartenAufUnterschrift;
		boolean oldWartenAufUnterschriftESet = wartenAufUnterschriftESet;
		wartenAufUnterschrift = WARTEN_AUF_UNTERSCHRIFT_EDEFAULT;
		wartenAufUnterschriftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__WARTEN_AUF_UNTERSCHRIFT, oldWartenAufUnterschrift, WARTEN_AUF_UNTERSCHRIFT_EDEFAULT, oldWartenAufUnterschriftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWartenAufUnterschrift() {
		return wartenAufUnterschriftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzerklaerungenType getDsgvo() {
		return dsgvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsgvo(DatenschutzerklaerungenType newDsgvo, NotificationChain msgs) {
		DatenschutzerklaerungenType oldDsgvo = dsgvo;
		dsgvo = newDsgvo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO, oldDsgvo, newDsgvo);
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
	public void setDsgvo(DatenschutzerklaerungenType newDsgvo) {
		if (newDsgvo != dsgvo) {
			NotificationChain msgs = null;
			if (dsgvo != null)
				msgs = ((InternalEObject)dsgvo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO, null, msgs);
			if (newDsgvo != null)
				msgs = ((InternalEObject)newDsgvo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO, null, msgs);
			msgs = basicSetDsgvo(newDsgvo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO, newDsgvo, newDsgvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArtSignaturDigital() {
		return artSignaturDigital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtSignaturDigital(boolean newArtSignaturDigital) {
		boolean oldArtSignaturDigital = artSignaturDigital;
		artSignaturDigital = newArtSignaturDigital;
		boolean oldArtSignaturDigitalESet = artSignaturDigitalESet;
		artSignaturDigitalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ART_SIGNATUR_DIGITAL, oldArtSignaturDigital, artSignaturDigital, !oldArtSignaturDigitalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetArtSignaturDigital() {
		boolean oldArtSignaturDigital = artSignaturDigital;
		boolean oldArtSignaturDigitalESet = artSignaturDigitalESet;
		artSignaturDigital = ART_SIGNATUR_DIGITAL_EDEFAULT;
		artSignaturDigitalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ART_SIGNATUR_DIGITAL, oldArtSignaturDigital, ART_SIGNATUR_DIGITAL_EDEFAULT, oldArtSignaturDigitalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetArtSignaturDigital() {
		return artSignaturDigitalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BestaetigungAngabenType getBestaetigungAngaben() {
		return bestaetigungAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBestaetigungAngaben(BestaetigungAngabenType newBestaetigungAngaben, NotificationChain msgs) {
		BestaetigungAngabenType oldBestaetigungAngaben = bestaetigungAngaben;
		bestaetigungAngaben = newBestaetigungAngaben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN, oldBestaetigungAngaben, newBestaetigungAngaben);
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
	public void setBestaetigungAngaben(BestaetigungAngabenType newBestaetigungAngaben) {
		if (newBestaetigungAngaben != bestaetigungAngaben) {
			NotificationChain msgs = null;
			if (bestaetigungAngaben != null)
				msgs = ((InternalEObject)bestaetigungAngaben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN, null, msgs);
			if (newBestaetigungAngaben != null)
				msgs = ((InternalEObject)newBestaetigungAngaben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN, null, msgs);
			msgs = basicSetBestaetigungAngaben(newBestaetigungAngaben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN, newBestaetigungAngaben, newBestaetigungAngaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMerkblattUVG() {
		return merkblattUVG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerkblattUVG(boolean newMerkblattUVG) {
		boolean oldMerkblattUVG = merkblattUVG;
		merkblattUVG = newMerkblattUVG;
		boolean oldMerkblattUVGESet = merkblattUVGESet;
		merkblattUVGESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__MERKBLATT_UVG, oldMerkblattUVG, merkblattUVG, !oldMerkblattUVGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMerkblattUVG() {
		boolean oldMerkblattUVG = merkblattUVG;
		boolean oldMerkblattUVGESet = merkblattUVGESet;
		merkblattUVG = MERKBLATT_UVG_EDEFAULT;
		merkblattUVGESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__MERKBLATT_UVG, oldMerkblattUVG, MERKBLATT_UVG_EDEFAULT, oldMerkblattUVGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMerkblattUVG() {
		return merkblattUVGESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND:
				return basicSetAntragskind(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return basicSetAntragstellenderElternteil(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL:
				return basicSetAndererElternteil(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT:
				return basicSetUnterhalt(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF:
				return basicSetDatenabruf(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG:
				return basicSetPdfAntrag(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO:
				return basicSetDsgvo(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN:
				return basicSetBestaetigungAngaben(null, msgs);
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN:
				return getGesamtZahlDerNachrichten();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND:
				return getAntragskind();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return getAntragstellenderElternteil();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL:
				return getAndererElternteil();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT:
				return getUnterhalt();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF:
				return getDatenabruf();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG:
				return getPdfAntrag();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				return isWartenAufUnterschrift();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO:
				return getDsgvo();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ART_SIGNATUR_DIGITAL:
				return isArtSignaturDigital();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN:
				return getBestaetigungAngaben();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__MERKBLATT_UVG:
				return isMerkblattUVG();
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN:
				setGesamtZahlDerNachrichten((BigInteger)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND:
				setAntragskind((AntragskindUeberpruefungType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				setAntragstellenderElternteil((AntragstellenderElternteilUeberpruefungType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL:
				setAndererElternteil((AndererElternteilUeberpruefungType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT:
				setUnterhalt((UnterhaltUeberpruefungType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF:
				setDatenabruf((DatenabrufType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG:
				setPdfAntrag((NachweisdokumentType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				setWartenAufUnterschrift((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ART_SIGNATUR_DIGITAL:
				setArtSignaturDigital((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN:
				setBestaetigungAngaben((BestaetigungAngabenType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__MERKBLATT_UVG:
				setMerkblattUVG((Boolean)newValue);
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN:
				setGesamtZahlDerNachrichten(GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND:
				setAntragskind((AntragskindUeberpruefungType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				setAntragstellenderElternteil((AntragstellenderElternteilUeberpruefungType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL:
				setAndererElternteil((AndererElternteilUeberpruefungType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT:
				setUnterhalt((UnterhaltUeberpruefungType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF:
				setDatenabruf((DatenabrufType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG:
				setPdfAntrag((NachweisdokumentType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				unsetWartenAufUnterschrift();
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ART_SIGNATUR_DIGITAL:
				unsetArtSignaturDigital();
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN:
				setBestaetigungAngaben((BestaetigungAngabenType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__MERKBLATT_UVG:
				unsetMerkblattUVG();
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
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__GESAMT_ZAHL_DER_NACHRICHTEN:
				return GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT == null ? gesamtZahlDerNachrichten != null : !GESAMT_ZAHL_DER_NACHRICHTEN_EDEFAULT.equals(gesamtZahlDerNachrichten);
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSKIND:
				return antragskind != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return antragstellenderElternteil != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ANDERER_ELTERNTEIL:
				return andererElternteil != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__UNTERHALT:
				return unterhalt != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DATENABRUF:
				return datenabruf != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__PDF_ANTRAG:
				return pdfAntrag != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				return isSetWartenAufUnterschrift();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__DSGVO:
				return dsgvo != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__ART_SIGNATUR_DIGITAL:
				return isSetArtSignaturDigital();
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__BESTAETIGUNG_ANGABEN:
				return bestaetigungAngaben != null;
			case UnterhaltsvorschussPackage.UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302_TYPE__MERKBLATT_UVG:
				return isSetMerkblattUVG();
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
		result.append(" (gesamtZahlDerNachrichten: ");
		result.append(gesamtZahlDerNachrichten);
		result.append(", wartenAufUnterschrift: ");
		if (wartenAufUnterschriftESet) result.append(wartenAufUnterschrift); else result.append("<unset>");
		result.append(", artSignaturDigital: ");
		if (artSignaturDigitalESet) result.append(artSignaturDigital); else result.append("<unset>");
		result.append(", merkblattUVG: ");
		if (merkblattUVGESet) result.append(merkblattUVG); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UnterhaltsvorschussantragJaehrlicheUeberpruefung0302TypeImpl
