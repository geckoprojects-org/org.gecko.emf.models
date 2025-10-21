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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeWohnsitzType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GewoehnlicherAufenthaltType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gewoehnlicher Aufenthalt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GewoehnlicherAufenthaltTypeImpl#getWohnsitz <em>Wohnsitz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GewoehnlicherAufenthaltTypeImpl#getBeginnAufenthaltD <em>Beginn Aufenthalt D</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GewoehnlicherAufenthaltTypeImpl#getBefristeterAuslandsaufenthalt <em>Befristeter Auslandsaufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GewoehnlicherAufenthaltTypeImpl#getUnbefristeterAuslandsaufenthalt <em>Unbefristeter Auslandsaufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GewoehnlicherAufenthaltTypeImpl#getAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GewoehnlicherAufenthaltTypeImpl#isMitgliedNatoZivilesGefolge <em>Mitglied Nato Ziviles Gefolge</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GewoehnlicherAufenthaltTypeImpl#isMitgliedDiplomatischeMissionOderKonsularischeVertretung <em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GewoehnlicherAufenthaltTypeImpl extends MinimalEObjectImpl.Container implements GewoehnlicherAufenthaltType {
	/**
	 * The cached value of the '{@link #getWohnsitz() <em>Wohnsitz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnsitz()
	 * @generated
	 * @ordered
	 */
	protected CodeWohnsitzType wohnsitz;

	/**
	 * The default value of the '{@link #getBeginnAufenthaltD() <em>Beginn Aufenthalt D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnAufenthaltD()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGINN_AUFENTHALT_D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginnAufenthaltD() <em>Beginn Aufenthalt D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnAufenthaltD()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar beginnAufenthaltD = BEGINN_AUFENTHALT_D_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBefristeterAuslandsaufenthalt() <em>Befristeter Auslandsaufenthalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefristeterAuslandsaufenthalt()
	 * @generated
	 * @ordered
	 */
	protected AuslandsaufenthaltBefrType befristeterAuslandsaufenthalt;

	/**
	 * The cached value of the '{@link #getUnbefristeterAuslandsaufenthalt() <em>Unbefristeter Auslandsaufenthalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbefristeterAuslandsaufenthalt()
	 * @generated
	 * @ordered
	 */
	protected AuslandsaufenthaltType unbefristeterAuslandsaufenthalt;

	/**
	 * The cached value of the '{@link #getAuslaendischesArbeitsverhaeltnis() <em>Auslaendisches Arbeitsverhaeltnis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuslaendischesArbeitsverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected AuslaendischesArbeitsverhaeltnisType auslaendischesArbeitsverhaeltnis;

	/**
	 * The default value of the '{@link #isMitgliedNatoZivilesGefolge() <em>Mitglied Nato Ziviles Gefolge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMitgliedNatoZivilesGefolge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MITGLIED_NATO_ZIVILES_GEFOLGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMitgliedNatoZivilesGefolge() <em>Mitglied Nato Ziviles Gefolge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMitgliedNatoZivilesGefolge()
	 * @generated
	 * @ordered
	 */
	protected boolean mitgliedNatoZivilesGefolge = MITGLIED_NATO_ZIVILES_GEFOLGE_EDEFAULT;

	/**
	 * This is true if the Mitglied Nato Ziviles Gefolge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mitgliedNatoZivilesGefolgeESet;

	/**
	 * The default value of the '{@link #isMitgliedDiplomatischeMissionOderKonsularischeVertretung() <em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMitgliedDiplomatischeMissionOderKonsularischeVertretung() <em>Mitglied Diplomatische Mission Oder Konsularische Vertretung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMitgliedDiplomatischeMissionOderKonsularischeVertretung()
	 * @generated
	 * @ordered
	 */
	protected boolean mitgliedDiplomatischeMissionOderKonsularischeVertretung = MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG_EDEFAULT;

	/**
	 * This is true if the Mitglied Diplomatische Mission Oder Konsularische Vertretung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mitgliedDiplomatischeMissionOderKonsularischeVertretungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GewoehnlicherAufenthaltTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getGewoehnlicherAufenthaltType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeWohnsitzType getWohnsitz() {
		return wohnsitz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWohnsitz(CodeWohnsitzType newWohnsitz, NotificationChain msgs) {
		CodeWohnsitzType oldWohnsitz = wohnsitz;
		wohnsitz = newWohnsitz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ, oldWohnsitz, newWohnsitz);
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
	public void setWohnsitz(CodeWohnsitzType newWohnsitz) {
		if (newWohnsitz != wohnsitz) {
			NotificationChain msgs = null;
			if (wohnsitz != null)
				msgs = ((InternalEObject)wohnsitz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ, null, msgs);
			if (newWohnsitz != null)
				msgs = ((InternalEObject)newWohnsitz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ, null, msgs);
			msgs = basicSetWohnsitz(newWohnsitz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ, newWohnsitz, newWohnsitz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBeginnAufenthaltD() {
		return beginnAufenthaltD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginnAufenthaltD(XMLGregorianCalendar newBeginnAufenthaltD) {
		XMLGregorianCalendar oldBeginnAufenthaltD = beginnAufenthaltD;
		beginnAufenthaltD = newBeginnAufenthaltD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEGINN_AUFENTHALT_D, oldBeginnAufenthaltD, beginnAufenthaltD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslandsaufenthaltBefrType getBefristeterAuslandsaufenthalt() {
		return befristeterAuslandsaufenthalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefristeterAuslandsaufenthalt(AuslandsaufenthaltBefrType newBefristeterAuslandsaufenthalt, NotificationChain msgs) {
		AuslandsaufenthaltBefrType oldBefristeterAuslandsaufenthalt = befristeterAuslandsaufenthalt;
		befristeterAuslandsaufenthalt = newBefristeterAuslandsaufenthalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT, oldBefristeterAuslandsaufenthalt, newBefristeterAuslandsaufenthalt);
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
	public void setBefristeterAuslandsaufenthalt(AuslandsaufenthaltBefrType newBefristeterAuslandsaufenthalt) {
		if (newBefristeterAuslandsaufenthalt != befristeterAuslandsaufenthalt) {
			NotificationChain msgs = null;
			if (befristeterAuslandsaufenthalt != null)
				msgs = ((InternalEObject)befristeterAuslandsaufenthalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT, null, msgs);
			if (newBefristeterAuslandsaufenthalt != null)
				msgs = ((InternalEObject)newBefristeterAuslandsaufenthalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT, null, msgs);
			msgs = basicSetBefristeterAuslandsaufenthalt(newBefristeterAuslandsaufenthalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT, newBefristeterAuslandsaufenthalt, newBefristeterAuslandsaufenthalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslandsaufenthaltType getUnbefristeterAuslandsaufenthalt() {
		return unbefristeterAuslandsaufenthalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnbefristeterAuslandsaufenthalt(AuslandsaufenthaltType newUnbefristeterAuslandsaufenthalt, NotificationChain msgs) {
		AuslandsaufenthaltType oldUnbefristeterAuslandsaufenthalt = unbefristeterAuslandsaufenthalt;
		unbefristeterAuslandsaufenthalt = newUnbefristeterAuslandsaufenthalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT, oldUnbefristeterAuslandsaufenthalt, newUnbefristeterAuslandsaufenthalt);
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
	public void setUnbefristeterAuslandsaufenthalt(AuslandsaufenthaltType newUnbefristeterAuslandsaufenthalt) {
		if (newUnbefristeterAuslandsaufenthalt != unbefristeterAuslandsaufenthalt) {
			NotificationChain msgs = null;
			if (unbefristeterAuslandsaufenthalt != null)
				msgs = ((InternalEObject)unbefristeterAuslandsaufenthalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT, null, msgs);
			if (newUnbefristeterAuslandsaufenthalt != null)
				msgs = ((InternalEObject)newUnbefristeterAuslandsaufenthalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT, null, msgs);
			msgs = basicSetUnbefristeterAuslandsaufenthalt(newUnbefristeterAuslandsaufenthalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT, newUnbefristeterAuslandsaufenthalt, newUnbefristeterAuslandsaufenthalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslaendischesArbeitsverhaeltnisType getAuslaendischesArbeitsverhaeltnis() {
		return auslaendischesArbeitsverhaeltnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuslaendischesArbeitsverhaeltnis(AuslaendischesArbeitsverhaeltnisType newAuslaendischesArbeitsverhaeltnis, NotificationChain msgs) {
		AuslaendischesArbeitsverhaeltnisType oldAuslaendischesArbeitsverhaeltnis = auslaendischesArbeitsverhaeltnis;
		auslaendischesArbeitsverhaeltnis = newAuslaendischesArbeitsverhaeltnis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS, oldAuslaendischesArbeitsverhaeltnis, newAuslaendischesArbeitsverhaeltnis);
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
	public void setAuslaendischesArbeitsverhaeltnis(AuslaendischesArbeitsverhaeltnisType newAuslaendischesArbeitsverhaeltnis) {
		if (newAuslaendischesArbeitsverhaeltnis != auslaendischesArbeitsverhaeltnis) {
			NotificationChain msgs = null;
			if (auslaendischesArbeitsverhaeltnis != null)
				msgs = ((InternalEObject)auslaendischesArbeitsverhaeltnis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS, null, msgs);
			if (newAuslaendischesArbeitsverhaeltnis != null)
				msgs = ((InternalEObject)newAuslaendischesArbeitsverhaeltnis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS, null, msgs);
			msgs = basicSetAuslaendischesArbeitsverhaeltnis(newAuslaendischesArbeitsverhaeltnis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS, newAuslaendischesArbeitsverhaeltnis, newAuslaendischesArbeitsverhaeltnis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMitgliedNatoZivilesGefolge() {
		return mitgliedNatoZivilesGefolge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMitgliedNatoZivilesGefolge(boolean newMitgliedNatoZivilesGefolge) {
		boolean oldMitgliedNatoZivilesGefolge = mitgliedNatoZivilesGefolge;
		mitgliedNatoZivilesGefolge = newMitgliedNatoZivilesGefolge;
		boolean oldMitgliedNatoZivilesGefolgeESet = mitgliedNatoZivilesGefolgeESet;
		mitgliedNatoZivilesGefolgeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_NATO_ZIVILES_GEFOLGE, oldMitgliedNatoZivilesGefolge, mitgliedNatoZivilesGefolge, !oldMitgliedNatoZivilesGefolgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMitgliedNatoZivilesGefolge() {
		boolean oldMitgliedNatoZivilesGefolge = mitgliedNatoZivilesGefolge;
		boolean oldMitgliedNatoZivilesGefolgeESet = mitgliedNatoZivilesGefolgeESet;
		mitgliedNatoZivilesGefolge = MITGLIED_NATO_ZIVILES_GEFOLGE_EDEFAULT;
		mitgliedNatoZivilesGefolgeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_NATO_ZIVILES_GEFOLGE, oldMitgliedNatoZivilesGefolge, MITGLIED_NATO_ZIVILES_GEFOLGE_EDEFAULT, oldMitgliedNatoZivilesGefolgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMitgliedNatoZivilesGefolge() {
		return mitgliedNatoZivilesGefolgeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMitgliedDiplomatischeMissionOderKonsularischeVertretung() {
		return mitgliedDiplomatischeMissionOderKonsularischeVertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMitgliedDiplomatischeMissionOderKonsularischeVertretung(boolean newMitgliedDiplomatischeMissionOderKonsularischeVertretung) {
		boolean oldMitgliedDiplomatischeMissionOderKonsularischeVertretung = mitgliedDiplomatischeMissionOderKonsularischeVertretung;
		mitgliedDiplomatischeMissionOderKonsularischeVertretung = newMitgliedDiplomatischeMissionOderKonsularischeVertretung;
		boolean oldMitgliedDiplomatischeMissionOderKonsularischeVertretungESet = mitgliedDiplomatischeMissionOderKonsularischeVertretungESet;
		mitgliedDiplomatischeMissionOderKonsularischeVertretungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG, oldMitgliedDiplomatischeMissionOderKonsularischeVertretung, mitgliedDiplomatischeMissionOderKonsularischeVertretung, !oldMitgliedDiplomatischeMissionOderKonsularischeVertretungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMitgliedDiplomatischeMissionOderKonsularischeVertretung() {
		boolean oldMitgliedDiplomatischeMissionOderKonsularischeVertretung = mitgliedDiplomatischeMissionOderKonsularischeVertretung;
		boolean oldMitgliedDiplomatischeMissionOderKonsularischeVertretungESet = mitgliedDiplomatischeMissionOderKonsularischeVertretungESet;
		mitgliedDiplomatischeMissionOderKonsularischeVertretung = MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG_EDEFAULT;
		mitgliedDiplomatischeMissionOderKonsularischeVertretungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG, oldMitgliedDiplomatischeMissionOderKonsularischeVertretung, MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG_EDEFAULT, oldMitgliedDiplomatischeMissionOderKonsularischeVertretungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMitgliedDiplomatischeMissionOderKonsularischeVertretung() {
		return mitgliedDiplomatischeMissionOderKonsularischeVertretungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ:
				return basicSetWohnsitz(null, msgs);
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT:
				return basicSetBefristeterAuslandsaufenthalt(null, msgs);
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT:
				return basicSetUnbefristeterAuslandsaufenthalt(null, msgs);
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS:
				return basicSetAuslaendischesArbeitsverhaeltnis(null, msgs);
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
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ:
				return getWohnsitz();
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEGINN_AUFENTHALT_D:
				return getBeginnAufenthaltD();
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT:
				return getBefristeterAuslandsaufenthalt();
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT:
				return getUnbefristeterAuslandsaufenthalt();
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS:
				return getAuslaendischesArbeitsverhaeltnis();
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_NATO_ZIVILES_GEFOLGE:
				return isMitgliedNatoZivilesGefolge();
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG:
				return isMitgliedDiplomatischeMissionOderKonsularischeVertretung();
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
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ:
				setWohnsitz((CodeWohnsitzType)newValue);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEGINN_AUFENTHALT_D:
				setBeginnAufenthaltD((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT:
				setBefristeterAuslandsaufenthalt((AuslandsaufenthaltBefrType)newValue);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT:
				setUnbefristeterAuslandsaufenthalt((AuslandsaufenthaltType)newValue);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS:
				setAuslaendischesArbeitsverhaeltnis((AuslaendischesArbeitsverhaeltnisType)newValue);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_NATO_ZIVILES_GEFOLGE:
				setMitgliedNatoZivilesGefolge((Boolean)newValue);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG:
				setMitgliedDiplomatischeMissionOderKonsularischeVertretung((Boolean)newValue);
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
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ:
				setWohnsitz((CodeWohnsitzType)null);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEGINN_AUFENTHALT_D:
				setBeginnAufenthaltD(BEGINN_AUFENTHALT_D_EDEFAULT);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT:
				setBefristeterAuslandsaufenthalt((AuslandsaufenthaltBefrType)null);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT:
				setUnbefristeterAuslandsaufenthalt((AuslandsaufenthaltType)null);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS:
				setAuslaendischesArbeitsverhaeltnis((AuslaendischesArbeitsverhaeltnisType)null);
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_NATO_ZIVILES_GEFOLGE:
				unsetMitgliedNatoZivilesGefolge();
				return;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG:
				unsetMitgliedDiplomatischeMissionOderKonsularischeVertretung();
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
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__WOHNSITZ:
				return wohnsitz != null;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEGINN_AUFENTHALT_D:
				return BEGINN_AUFENTHALT_D_EDEFAULT == null ? beginnAufenthaltD != null : !BEGINN_AUFENTHALT_D_EDEFAULT.equals(beginnAufenthaltD);
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__BEFRISTETER_AUSLANDSAUFENTHALT:
				return befristeterAuslandsaufenthalt != null;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__UNBEFRISTETER_AUSLANDSAUFENTHALT:
				return unbefristeterAuslandsaufenthalt != null;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS:
				return auslaendischesArbeitsverhaeltnis != null;
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_NATO_ZIVILES_GEFOLGE:
				return isSetMitgliedNatoZivilesGefolge();
			case ElterngeldPackage.GEWOEHNLICHER_AUFENTHALT_TYPE__MITGLIED_DIPLOMATISCHE_MISSION_ODER_KONSULARISCHE_VERTRETUNG:
				return isSetMitgliedDiplomatischeMissionOderKonsularischeVertretung();
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
		result.append(" (beginnAufenthaltD: ");
		result.append(beginnAufenthaltD);
		result.append(", mitgliedNatoZivilesGefolge: ");
		if (mitgliedNatoZivilesGefolgeESet) result.append(mitgliedNatoZivilesGefolge); else result.append("<unset>");
		result.append(", mitgliedDiplomatischeMissionOderKonsularischeVertretung: ");
		if (mitgliedDiplomatischeMissionOderKonsularischeVertretungESet) result.append(mitgliedDiplomatischeMissionOderKonsularischeVertretung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GewoehnlicherAufenthaltTypeImpl
