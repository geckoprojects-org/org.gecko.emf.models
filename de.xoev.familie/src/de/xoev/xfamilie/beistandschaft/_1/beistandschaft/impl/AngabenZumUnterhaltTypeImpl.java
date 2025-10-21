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

import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeUnterhaltstitelBestehtType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeZahlungsartBSSType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Zum Unterhalt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getAngabenZumUnterhaltstitel <em>Angaben Zum Unterhaltstitel</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#isBemuehungUnterhaltszahlung <em>Bemuehung Unterhaltszahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getBisherigeBemuehungen <em>Bisherige Bemuehungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#isZahltBereits <em>Zahlt Bereits</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getHoeheZahlung <em>Hoehe Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getLetzteZahlungAm <em>Letzte Zahlung Am</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#isRegelmaessigeZahlung <em>Regelmaessige Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getAngabenZurZahlung <em>Angaben Zur Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#isGeltendmachungUnterhaltsrueckstaende <em>Geltendmachung Unterhaltsrueckstaende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getAngabeUnterhaltsrueckstaende <em>Angabe Unterhaltsrueckstaende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#isFreiwilligerVerzichtAufUnterhalt <em>Freiwilliger Verzicht Auf Unterhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getUnterhaltVerzichtZeitraum <em>Unterhalt Verzicht Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getZahlung <em>Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getBankverbindungZahlungJugendamt <em>Bankverbindung Zahlung Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumUnterhaltTypeImpl#getBankverbindungDirektzahlung <em>Bankverbindung Direktzahlung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZumUnterhaltTypeImpl extends MinimalEObjectImpl.Container implements AngabenZumUnterhaltType {
	/**
	 * The cached value of the '{@link #getAngabenZumUnterhaltstitel() <em>Angaben Zum Unterhaltstitel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumUnterhaltstitel()
	 * @generated
	 * @ordered
	 */
	protected CodeUnterhaltstitelBestehtType angabenZumUnterhaltstitel;

	/**
	 * The default value of the '{@link #isBemuehungUnterhaltszahlung() <em>Bemuehung Unterhaltszahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBemuehungUnterhaltszahlung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEMUEHUNG_UNTERHALTSZAHLUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBemuehungUnterhaltszahlung() <em>Bemuehung Unterhaltszahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBemuehungUnterhaltszahlung()
	 * @generated
	 * @ordered
	 */
	protected boolean bemuehungUnterhaltszahlung = BEMUEHUNG_UNTERHALTSZAHLUNG_EDEFAULT;

	/**
	 * This is true if the Bemuehung Unterhaltszahlung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bemuehungUnterhaltszahlungESet;

	/**
	 * The default value of the '{@link #getBisherigeBemuehungen() <em>Bisherige Bemuehungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBisherigeBemuehungen()
	 * @generated
	 * @ordered
	 */
	protected static final String BISHERIGE_BEMUEHUNGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBisherigeBemuehungen() <em>Bisherige Bemuehungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBisherigeBemuehungen()
	 * @generated
	 * @ordered
	 */
	protected String bisherigeBemuehungen = BISHERIGE_BEMUEHUNGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isZahltBereits() <em>Zahlt Bereits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZahltBereits()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZAHLT_BEREITS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZahltBereits() <em>Zahlt Bereits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZahltBereits()
	 * @generated
	 * @ordered
	 */
	protected boolean zahltBereits = ZAHLT_BEREITS_EDEFAULT;

	/**
	 * This is true if the Zahlt Bereits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zahltBereitsESet;

	/**
	 * The default value of the '{@link #getHoeheZahlung() <em>Hoehe Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheZahlung()
	 * @generated
	 * @ordered
	 */
	protected static final float HOEHE_ZAHLUNG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHoeheZahlung() <em>Hoehe Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheZahlung()
	 * @generated
	 * @ordered
	 */
	protected float hoeheZahlung = HOEHE_ZAHLUNG_EDEFAULT;

	/**
	 * This is true if the Hoehe Zahlung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hoeheZahlungESet;

	/**
	 * The default value of the '{@link #getLetzteZahlungAm() <em>Letzte Zahlung Am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetzteZahlungAm()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LETZTE_ZAHLUNG_AM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLetzteZahlungAm() <em>Letzte Zahlung Am</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetzteZahlungAm()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar letzteZahlungAm = LETZTE_ZAHLUNG_AM_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegelmaessigeZahlung() <em>Regelmaessige Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegelmaessigeZahlung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGELMAESSIGE_ZAHLUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegelmaessigeZahlung() <em>Regelmaessige Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegelmaessigeZahlung()
	 * @generated
	 * @ordered
	 */
	protected boolean regelmaessigeZahlung = REGELMAESSIGE_ZAHLUNG_EDEFAULT;

	/**
	 * This is true if the Regelmaessige Zahlung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regelmaessigeZahlungESet;

	/**
	 * The default value of the '{@link #getAngabenZurZahlung() <em>Angaben Zur Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZurZahlung()
	 * @generated
	 * @ordered
	 */
	protected static final String ANGABEN_ZUR_ZAHLUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngabenZurZahlung() <em>Angaben Zur Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZurZahlung()
	 * @generated
	 * @ordered
	 */
	protected String angabenZurZahlung = ANGABEN_ZUR_ZAHLUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #isGeltendmachungUnterhaltsrueckstaende() <em>Geltendmachung Unterhaltsrueckstaende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltendmachungUnterhaltsrueckstaende()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeltendmachungUnterhaltsrueckstaende() <em>Geltendmachung Unterhaltsrueckstaende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeltendmachungUnterhaltsrueckstaende()
	 * @generated
	 * @ordered
	 */
	protected boolean geltendmachungUnterhaltsrueckstaende = GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE_EDEFAULT;

	/**
	 * This is true if the Geltendmachung Unterhaltsrueckstaende attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geltendmachungUnterhaltsrueckstaendeESet;

	/**
	 * The default value of the '{@link #getAngabeUnterhaltsrueckstaende() <em>Angabe Unterhaltsrueckstaende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabeUnterhaltsrueckstaende()
	 * @generated
	 * @ordered
	 */
	protected static final String ANGABE_UNTERHALTSRUECKSTAENDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngabeUnterhaltsrueckstaende() <em>Angabe Unterhaltsrueckstaende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabeUnterhaltsrueckstaende()
	 * @generated
	 * @ordered
	 */
	protected String angabeUnterhaltsrueckstaende = ANGABE_UNTERHALTSRUECKSTAENDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFreiwilligerVerzichtAufUnterhalt() <em>Freiwilliger Verzicht Auf Unterhalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreiwilligerVerzichtAufUnterhalt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FREIWILLIGER_VERZICHT_AUF_UNTERHALT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFreiwilligerVerzichtAufUnterhalt() <em>Freiwilliger Verzicht Auf Unterhalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreiwilligerVerzichtAufUnterhalt()
	 * @generated
	 * @ordered
	 */
	protected boolean freiwilligerVerzichtAufUnterhalt = FREIWILLIGER_VERZICHT_AUF_UNTERHALT_EDEFAULT;

	/**
	 * This is true if the Freiwilliger Verzicht Auf Unterhalt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean freiwilligerVerzichtAufUnterhaltESet;

	/**
	 * The default value of the '{@link #getUnterhaltVerzichtZeitraum() <em>Unterhalt Verzicht Zeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhaltVerzichtZeitraum()
	 * @generated
	 * @ordered
	 */
	protected static final String UNTERHALT_VERZICHT_ZEITRAUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnterhaltVerzichtZeitraum() <em>Unterhalt Verzicht Zeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhaltVerzichtZeitraum()
	 * @generated
	 * @ordered
	 */
	protected String unterhaltVerzichtZeitraum = UNTERHALT_VERZICHT_ZEITRAUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZahlung() <em>Zahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZahlung()
	 * @generated
	 * @ordered
	 */
	protected CodeZahlungsartBSSType zahlung;

	/**
	 * The cached value of the '{@link #getBankverbindungZahlungJugendamt() <em>Bankverbindung Zahlung Jugendamt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankverbindungZahlungJugendamt()
	 * @generated
	 * @ordered
	 */
	protected BankverbindungType bankverbindungZahlungJugendamt;

	/**
	 * The cached value of the '{@link #getBankverbindungDirektzahlung() <em>Bankverbindung Direktzahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankverbindungDirektzahlung()
	 * @generated
	 * @ordered
	 */
	protected BankverbindungType bankverbindungDirektzahlung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZumUnterhaltTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.ANGABEN_ZUM_UNTERHALT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeUnterhaltstitelBestehtType getAngabenZumUnterhaltstitel() {
		return angabenZumUnterhaltstitel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumUnterhaltstitel(CodeUnterhaltstitelBestehtType newAngabenZumUnterhaltstitel, NotificationChain msgs) {
		CodeUnterhaltstitelBestehtType oldAngabenZumUnterhaltstitel = angabenZumUnterhaltstitel;
		angabenZumUnterhaltstitel = newAngabenZumUnterhaltstitel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL, oldAngabenZumUnterhaltstitel, newAngabenZumUnterhaltstitel);
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
	public void setAngabenZumUnterhaltstitel(CodeUnterhaltstitelBestehtType newAngabenZumUnterhaltstitel) {
		if (newAngabenZumUnterhaltstitel != angabenZumUnterhaltstitel) {
			NotificationChain msgs = null;
			if (angabenZumUnterhaltstitel != null)
				msgs = ((InternalEObject)angabenZumUnterhaltstitel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL, null, msgs);
			if (newAngabenZumUnterhaltstitel != null)
				msgs = ((InternalEObject)newAngabenZumUnterhaltstitel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL, null, msgs);
			msgs = basicSetAngabenZumUnterhaltstitel(newAngabenZumUnterhaltstitel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL, newAngabenZumUnterhaltstitel, newAngabenZumUnterhaltstitel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBemuehungUnterhaltszahlung() {
		return bemuehungUnterhaltszahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBemuehungUnterhaltszahlung(boolean newBemuehungUnterhaltszahlung) {
		boolean oldBemuehungUnterhaltszahlung = bemuehungUnterhaltszahlung;
		bemuehungUnterhaltszahlung = newBemuehungUnterhaltszahlung;
		boolean oldBemuehungUnterhaltszahlungESet = bemuehungUnterhaltszahlungESet;
		bemuehungUnterhaltszahlungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BEMUEHUNG_UNTERHALTSZAHLUNG, oldBemuehungUnterhaltszahlung, bemuehungUnterhaltszahlung, !oldBemuehungUnterhaltszahlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBemuehungUnterhaltszahlung() {
		boolean oldBemuehungUnterhaltszahlung = bemuehungUnterhaltszahlung;
		boolean oldBemuehungUnterhaltszahlungESet = bemuehungUnterhaltszahlungESet;
		bemuehungUnterhaltszahlung = BEMUEHUNG_UNTERHALTSZAHLUNG_EDEFAULT;
		bemuehungUnterhaltszahlungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BEMUEHUNG_UNTERHALTSZAHLUNG, oldBemuehungUnterhaltszahlung, BEMUEHUNG_UNTERHALTSZAHLUNG_EDEFAULT, oldBemuehungUnterhaltszahlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBemuehungUnterhaltszahlung() {
		return bemuehungUnterhaltszahlungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBisherigeBemuehungen() {
		return bisherigeBemuehungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBisherigeBemuehungen(String newBisherigeBemuehungen) {
		String oldBisherigeBemuehungen = bisherigeBemuehungen;
		bisherigeBemuehungen = newBisherigeBemuehungen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BISHERIGE_BEMUEHUNGEN, oldBisherigeBemuehungen, bisherigeBemuehungen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZahltBereits() {
		return zahltBereits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZahltBereits(boolean newZahltBereits) {
		boolean oldZahltBereits = zahltBereits;
		zahltBereits = newZahltBereits;
		boolean oldZahltBereitsESet = zahltBereitsESet;
		zahltBereitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLT_BEREITS, oldZahltBereits, zahltBereits, !oldZahltBereitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZahltBereits() {
		boolean oldZahltBereits = zahltBereits;
		boolean oldZahltBereitsESet = zahltBereitsESet;
		zahltBereits = ZAHLT_BEREITS_EDEFAULT;
		zahltBereitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLT_BEREITS, oldZahltBereits, ZAHLT_BEREITS_EDEFAULT, oldZahltBereitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZahltBereits() {
		return zahltBereitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getHoeheZahlung() {
		return hoeheZahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoeheZahlung(float newHoeheZahlung) {
		float oldHoeheZahlung = hoeheZahlung;
		hoeheZahlung = newHoeheZahlung;
		boolean oldHoeheZahlungESet = hoeheZahlungESet;
		hoeheZahlungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__HOEHE_ZAHLUNG, oldHoeheZahlung, hoeheZahlung, !oldHoeheZahlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHoeheZahlung() {
		float oldHoeheZahlung = hoeheZahlung;
		boolean oldHoeheZahlungESet = hoeheZahlungESet;
		hoeheZahlung = HOEHE_ZAHLUNG_EDEFAULT;
		hoeheZahlungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__HOEHE_ZAHLUNG, oldHoeheZahlung, HOEHE_ZAHLUNG_EDEFAULT, oldHoeheZahlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHoeheZahlung() {
		return hoeheZahlungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLetzteZahlungAm() {
		return letzteZahlungAm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLetzteZahlungAm(XMLGregorianCalendar newLetzteZahlungAm) {
		XMLGregorianCalendar oldLetzteZahlungAm = letzteZahlungAm;
		letzteZahlungAm = newLetzteZahlungAm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__LETZTE_ZAHLUNG_AM, oldLetzteZahlungAm, letzteZahlungAm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRegelmaessigeZahlung() {
		return regelmaessigeZahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegelmaessigeZahlung(boolean newRegelmaessigeZahlung) {
		boolean oldRegelmaessigeZahlung = regelmaessigeZahlung;
		regelmaessigeZahlung = newRegelmaessigeZahlung;
		boolean oldRegelmaessigeZahlungESet = regelmaessigeZahlungESet;
		regelmaessigeZahlungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__REGELMAESSIGE_ZAHLUNG, oldRegelmaessigeZahlung, regelmaessigeZahlung, !oldRegelmaessigeZahlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRegelmaessigeZahlung() {
		boolean oldRegelmaessigeZahlung = regelmaessigeZahlung;
		boolean oldRegelmaessigeZahlungESet = regelmaessigeZahlungESet;
		regelmaessigeZahlung = REGELMAESSIGE_ZAHLUNG_EDEFAULT;
		regelmaessigeZahlungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__REGELMAESSIGE_ZAHLUNG, oldRegelmaessigeZahlung, REGELMAESSIGE_ZAHLUNG_EDEFAULT, oldRegelmaessigeZahlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRegelmaessigeZahlung() {
		return regelmaessigeZahlungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAngabenZurZahlung() {
		return angabenZurZahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngabenZurZahlung(String newAngabenZurZahlung) {
		String oldAngabenZurZahlung = angabenZurZahlung;
		angabenZurZahlung = newAngabenZurZahlung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUR_ZAHLUNG, oldAngabenZurZahlung, angabenZurZahlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGeltendmachungUnterhaltsrueckstaende() {
		return geltendmachungUnterhaltsrueckstaende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeltendmachungUnterhaltsrueckstaende(boolean newGeltendmachungUnterhaltsrueckstaende) {
		boolean oldGeltendmachungUnterhaltsrueckstaende = geltendmachungUnterhaltsrueckstaende;
		geltendmachungUnterhaltsrueckstaende = newGeltendmachungUnterhaltsrueckstaende;
		boolean oldGeltendmachungUnterhaltsrueckstaendeESet = geltendmachungUnterhaltsrueckstaendeESet;
		geltendmachungUnterhaltsrueckstaendeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE, oldGeltendmachungUnterhaltsrueckstaende, geltendmachungUnterhaltsrueckstaende, !oldGeltendmachungUnterhaltsrueckstaendeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGeltendmachungUnterhaltsrueckstaende() {
		boolean oldGeltendmachungUnterhaltsrueckstaende = geltendmachungUnterhaltsrueckstaende;
		boolean oldGeltendmachungUnterhaltsrueckstaendeESet = geltendmachungUnterhaltsrueckstaendeESet;
		geltendmachungUnterhaltsrueckstaende = GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE_EDEFAULT;
		geltendmachungUnterhaltsrueckstaendeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE, oldGeltendmachungUnterhaltsrueckstaende, GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE_EDEFAULT, oldGeltendmachungUnterhaltsrueckstaendeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGeltendmachungUnterhaltsrueckstaende() {
		return geltendmachungUnterhaltsrueckstaendeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAngabeUnterhaltsrueckstaende() {
		return angabeUnterhaltsrueckstaende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngabeUnterhaltsrueckstaende(String newAngabeUnterhaltsrueckstaende) {
		String oldAngabeUnterhaltsrueckstaende = angabeUnterhaltsrueckstaende;
		angabeUnterhaltsrueckstaende = newAngabeUnterhaltsrueckstaende;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABE_UNTERHALTSRUECKSTAENDE, oldAngabeUnterhaltsrueckstaende, angabeUnterhaltsrueckstaende));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFreiwilligerVerzichtAufUnterhalt() {
		return freiwilligerVerzichtAufUnterhalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreiwilligerVerzichtAufUnterhalt(boolean newFreiwilligerVerzichtAufUnterhalt) {
		boolean oldFreiwilligerVerzichtAufUnterhalt = freiwilligerVerzichtAufUnterhalt;
		freiwilligerVerzichtAufUnterhalt = newFreiwilligerVerzichtAufUnterhalt;
		boolean oldFreiwilligerVerzichtAufUnterhaltESet = freiwilligerVerzichtAufUnterhaltESet;
		freiwilligerVerzichtAufUnterhaltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__FREIWILLIGER_VERZICHT_AUF_UNTERHALT, oldFreiwilligerVerzichtAufUnterhalt, freiwilligerVerzichtAufUnterhalt, !oldFreiwilligerVerzichtAufUnterhaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFreiwilligerVerzichtAufUnterhalt() {
		boolean oldFreiwilligerVerzichtAufUnterhalt = freiwilligerVerzichtAufUnterhalt;
		boolean oldFreiwilligerVerzichtAufUnterhaltESet = freiwilligerVerzichtAufUnterhaltESet;
		freiwilligerVerzichtAufUnterhalt = FREIWILLIGER_VERZICHT_AUF_UNTERHALT_EDEFAULT;
		freiwilligerVerzichtAufUnterhaltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__FREIWILLIGER_VERZICHT_AUF_UNTERHALT, oldFreiwilligerVerzichtAufUnterhalt, FREIWILLIGER_VERZICHT_AUF_UNTERHALT_EDEFAULT, oldFreiwilligerVerzichtAufUnterhaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFreiwilligerVerzichtAufUnterhalt() {
		return freiwilligerVerzichtAufUnterhaltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnterhaltVerzichtZeitraum() {
		return unterhaltVerzichtZeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnterhaltVerzichtZeitraum(String newUnterhaltVerzichtZeitraum) {
		String oldUnterhaltVerzichtZeitraum = unterhaltVerzichtZeitraum;
		unterhaltVerzichtZeitraum = newUnterhaltVerzichtZeitraum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__UNTERHALT_VERZICHT_ZEITRAUM, oldUnterhaltVerzichtZeitraum, unterhaltVerzichtZeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeZahlungsartBSSType getZahlung() {
		return zahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZahlung(CodeZahlungsartBSSType newZahlung, NotificationChain msgs) {
		CodeZahlungsartBSSType oldZahlung = zahlung;
		zahlung = newZahlung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG, oldZahlung, newZahlung);
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
	public void setZahlung(CodeZahlungsartBSSType newZahlung) {
		if (newZahlung != zahlung) {
			NotificationChain msgs = null;
			if (zahlung != null)
				msgs = ((InternalEObject)zahlung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG, null, msgs);
			if (newZahlung != null)
				msgs = ((InternalEObject)newZahlung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG, null, msgs);
			msgs = basicSetZahlung(newZahlung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG, newZahlung, newZahlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankverbindungType getBankverbindungZahlungJugendamt() {
		return bankverbindungZahlungJugendamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBankverbindungZahlungJugendamt(BankverbindungType newBankverbindungZahlungJugendamt, NotificationChain msgs) {
		BankverbindungType oldBankverbindungZahlungJugendamt = bankverbindungZahlungJugendamt;
		bankverbindungZahlungJugendamt = newBankverbindungZahlungJugendamt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT, oldBankverbindungZahlungJugendamt, newBankverbindungZahlungJugendamt);
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
	public void setBankverbindungZahlungJugendamt(BankverbindungType newBankverbindungZahlungJugendamt) {
		if (newBankverbindungZahlungJugendamt != bankverbindungZahlungJugendamt) {
			NotificationChain msgs = null;
			if (bankverbindungZahlungJugendamt != null)
				msgs = ((InternalEObject)bankverbindungZahlungJugendamt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT, null, msgs);
			if (newBankverbindungZahlungJugendamt != null)
				msgs = ((InternalEObject)newBankverbindungZahlungJugendamt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT, null, msgs);
			msgs = basicSetBankverbindungZahlungJugendamt(newBankverbindungZahlungJugendamt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT, newBankverbindungZahlungJugendamt, newBankverbindungZahlungJugendamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankverbindungType getBankverbindungDirektzahlung() {
		return bankverbindungDirektzahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBankverbindungDirektzahlung(BankverbindungType newBankverbindungDirektzahlung, NotificationChain msgs) {
		BankverbindungType oldBankverbindungDirektzahlung = bankverbindungDirektzahlung;
		bankverbindungDirektzahlung = newBankverbindungDirektzahlung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG, oldBankverbindungDirektzahlung, newBankverbindungDirektzahlung);
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
	public void setBankverbindungDirektzahlung(BankverbindungType newBankverbindungDirektzahlung) {
		if (newBankverbindungDirektzahlung != bankverbindungDirektzahlung) {
			NotificationChain msgs = null;
			if (bankverbindungDirektzahlung != null)
				msgs = ((InternalEObject)bankverbindungDirektzahlung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG, null, msgs);
			if (newBankverbindungDirektzahlung != null)
				msgs = ((InternalEObject)newBankverbindungDirektzahlung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG, null, msgs);
			msgs = basicSetBankverbindungDirektzahlung(newBankverbindungDirektzahlung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG, newBankverbindungDirektzahlung, newBankverbindungDirektzahlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL:
				return basicSetAngabenZumUnterhaltstitel(null, msgs);
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG:
				return basicSetZahlung(null, msgs);
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT:
				return basicSetBankverbindungZahlungJugendamt(null, msgs);
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG:
				return basicSetBankverbindungDirektzahlung(null, msgs);
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
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL:
				return getAngabenZumUnterhaltstitel();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BEMUEHUNG_UNTERHALTSZAHLUNG:
				return isBemuehungUnterhaltszahlung();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BISHERIGE_BEMUEHUNGEN:
				return getBisherigeBemuehungen();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLT_BEREITS:
				return isZahltBereits();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__HOEHE_ZAHLUNG:
				return getHoeheZahlung();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__LETZTE_ZAHLUNG_AM:
				return getLetzteZahlungAm();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__REGELMAESSIGE_ZAHLUNG:
				return isRegelmaessigeZahlung();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUR_ZAHLUNG:
				return getAngabenZurZahlung();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE:
				return isGeltendmachungUnterhaltsrueckstaende();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABE_UNTERHALTSRUECKSTAENDE:
				return getAngabeUnterhaltsrueckstaende();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__FREIWILLIGER_VERZICHT_AUF_UNTERHALT:
				return isFreiwilligerVerzichtAufUnterhalt();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__UNTERHALT_VERZICHT_ZEITRAUM:
				return getUnterhaltVerzichtZeitraum();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG:
				return getZahlung();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT:
				return getBankverbindungZahlungJugendamt();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG:
				return getBankverbindungDirektzahlung();
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
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL:
				setAngabenZumUnterhaltstitel((CodeUnterhaltstitelBestehtType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BEMUEHUNG_UNTERHALTSZAHLUNG:
				setBemuehungUnterhaltszahlung((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BISHERIGE_BEMUEHUNGEN:
				setBisherigeBemuehungen((String)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLT_BEREITS:
				setZahltBereits((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__HOEHE_ZAHLUNG:
				setHoeheZahlung((Float)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__LETZTE_ZAHLUNG_AM:
				setLetzteZahlungAm((XMLGregorianCalendar)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__REGELMAESSIGE_ZAHLUNG:
				setRegelmaessigeZahlung((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUR_ZAHLUNG:
				setAngabenZurZahlung((String)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE:
				setGeltendmachungUnterhaltsrueckstaende((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABE_UNTERHALTSRUECKSTAENDE:
				setAngabeUnterhaltsrueckstaende((String)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__FREIWILLIGER_VERZICHT_AUF_UNTERHALT:
				setFreiwilligerVerzichtAufUnterhalt((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__UNTERHALT_VERZICHT_ZEITRAUM:
				setUnterhaltVerzichtZeitraum((String)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG:
				setZahlung((CodeZahlungsartBSSType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT:
				setBankverbindungZahlungJugendamt((BankverbindungType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG:
				setBankverbindungDirektzahlung((BankverbindungType)newValue);
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
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL:
				setAngabenZumUnterhaltstitel((CodeUnterhaltstitelBestehtType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BEMUEHUNG_UNTERHALTSZAHLUNG:
				unsetBemuehungUnterhaltszahlung();
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BISHERIGE_BEMUEHUNGEN:
				setBisherigeBemuehungen(BISHERIGE_BEMUEHUNGEN_EDEFAULT);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLT_BEREITS:
				unsetZahltBereits();
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__HOEHE_ZAHLUNG:
				unsetHoeheZahlung();
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__LETZTE_ZAHLUNG_AM:
				setLetzteZahlungAm(LETZTE_ZAHLUNG_AM_EDEFAULT);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__REGELMAESSIGE_ZAHLUNG:
				unsetRegelmaessigeZahlung();
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUR_ZAHLUNG:
				setAngabenZurZahlung(ANGABEN_ZUR_ZAHLUNG_EDEFAULT);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE:
				unsetGeltendmachungUnterhaltsrueckstaende();
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABE_UNTERHALTSRUECKSTAENDE:
				setAngabeUnterhaltsrueckstaende(ANGABE_UNTERHALTSRUECKSTAENDE_EDEFAULT);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__FREIWILLIGER_VERZICHT_AUF_UNTERHALT:
				unsetFreiwilligerVerzichtAufUnterhalt();
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__UNTERHALT_VERZICHT_ZEITRAUM:
				setUnterhaltVerzichtZeitraum(UNTERHALT_VERZICHT_ZEITRAUM_EDEFAULT);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG:
				setZahlung((CodeZahlungsartBSSType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT:
				setBankverbindungZahlungJugendamt((BankverbindungType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG:
				setBankverbindungDirektzahlung((BankverbindungType)null);
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
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUM_UNTERHALTSTITEL:
				return angabenZumUnterhaltstitel != null;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BEMUEHUNG_UNTERHALTSZAHLUNG:
				return isSetBemuehungUnterhaltszahlung();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BISHERIGE_BEMUEHUNGEN:
				return BISHERIGE_BEMUEHUNGEN_EDEFAULT == null ? bisherigeBemuehungen != null : !BISHERIGE_BEMUEHUNGEN_EDEFAULT.equals(bisherigeBemuehungen);
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLT_BEREITS:
				return isSetZahltBereits();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__HOEHE_ZAHLUNG:
				return isSetHoeheZahlung();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__LETZTE_ZAHLUNG_AM:
				return LETZTE_ZAHLUNG_AM_EDEFAULT == null ? letzteZahlungAm != null : !LETZTE_ZAHLUNG_AM_EDEFAULT.equals(letzteZahlungAm);
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__REGELMAESSIGE_ZAHLUNG:
				return isSetRegelmaessigeZahlung();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABEN_ZUR_ZAHLUNG:
				return ANGABEN_ZUR_ZAHLUNG_EDEFAULT == null ? angabenZurZahlung != null : !ANGABEN_ZUR_ZAHLUNG_EDEFAULT.equals(angabenZurZahlung);
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__GELTENDMACHUNG_UNTERHALTSRUECKSTAENDE:
				return isSetGeltendmachungUnterhaltsrueckstaende();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ANGABE_UNTERHALTSRUECKSTAENDE:
				return ANGABE_UNTERHALTSRUECKSTAENDE_EDEFAULT == null ? angabeUnterhaltsrueckstaende != null : !ANGABE_UNTERHALTSRUECKSTAENDE_EDEFAULT.equals(angabeUnterhaltsrueckstaende);
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__FREIWILLIGER_VERZICHT_AUF_UNTERHALT:
				return isSetFreiwilligerVerzichtAufUnterhalt();
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__UNTERHALT_VERZICHT_ZEITRAUM:
				return UNTERHALT_VERZICHT_ZEITRAUM_EDEFAULT == null ? unterhaltVerzichtZeitraum != null : !UNTERHALT_VERZICHT_ZEITRAUM_EDEFAULT.equals(unterhaltVerzichtZeitraum);
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__ZAHLUNG:
				return zahlung != null;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_ZAHLUNG_JUGENDAMT:
				return bankverbindungZahlungJugendamt != null;
			case BeistandschaftPackage.ANGABEN_ZUM_UNTERHALT_TYPE__BANKVERBINDUNG_DIREKTZAHLUNG:
				return bankverbindungDirektzahlung != null;
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
		result.append(" (bemuehungUnterhaltszahlung: ");
		if (bemuehungUnterhaltszahlungESet) result.append(bemuehungUnterhaltszahlung); else result.append("<unset>");
		result.append(", bisherigeBemuehungen: ");
		result.append(bisherigeBemuehungen);
		result.append(", zahltBereits: ");
		if (zahltBereitsESet) result.append(zahltBereits); else result.append("<unset>");
		result.append(", hoeheZahlung: ");
		if (hoeheZahlungESet) result.append(hoeheZahlung); else result.append("<unset>");
		result.append(", letzteZahlungAm: ");
		result.append(letzteZahlungAm);
		result.append(", regelmaessigeZahlung: ");
		if (regelmaessigeZahlungESet) result.append(regelmaessigeZahlung); else result.append("<unset>");
		result.append(", angabenZurZahlung: ");
		result.append(angabenZurZahlung);
		result.append(", geltendmachungUnterhaltsrueckstaende: ");
		if (geltendmachungUnterhaltsrueckstaendeESet) result.append(geltendmachungUnterhaltsrueckstaende); else result.append("<unset>");
		result.append(", angabeUnterhaltsrueckstaende: ");
		result.append(angabeUnterhaltsrueckstaende);
		result.append(", freiwilligerVerzichtAufUnterhalt: ");
		if (freiwilligerVerzichtAufUnterhaltESet) result.append(freiwilligerVerzichtAufUnterhalt); else result.append("<unset>");
		result.append(", unterhaltVerzichtZeitraum: ");
		result.append(unterhaltVerzichtZeitraum);
		result.append(')');
		return result.toString();
	}

} //AngabenZumUnterhaltTypeImpl
