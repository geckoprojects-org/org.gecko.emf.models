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
package de.xoev.xfamilie.geburt._1.geburt.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;
import de.xoev.xfamilie.geburt._1.geburt.ZusatzangabenType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zusatzangaben Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.ZusatzangabenTypeImpl#isMutterIstWarMitVaterVerheiratet <em>Mutter Ist War Mit Vater Verheiratet</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.ZusatzangabenTypeImpl#isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige <em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.ZusatzangabenTypeImpl#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.ZusatzangabenTypeImpl#isMutterZumZeitpunktDerGeburtVerheiratet <em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.ZusatzangabenTypeImpl#isGemeinsameSorgeerklaerung <em>Gemeinsame Sorgeerklaerung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZusatzangabenTypeImpl extends MinimalEObjectImpl.Container implements ZusatzangabenType {
	/**
	 * The default value of the '{@link #isMutterIstWarMitVaterVerheiratet() <em>Mutter Ist War Mit Vater Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterIstWarMitVaterVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTTER_IST_WAR_MIT_VATER_VERHEIRATET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMutterIstWarMitVaterVerheiratet() <em>Mutter Ist War Mit Vater Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterIstWarMitVaterVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected boolean mutterIstWarMitVaterVerheiratet = MUTTER_IST_WAR_MIT_VATER_VERHEIRATET_EDEFAULT;

	/**
	 * This is true if the Mutter Ist War Mit Vater Verheiratet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mutterIstWarMitVaterVerheiratetESet;

	/**
	 * The default value of the '{@link #isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige() <em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige() <em>Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige()
	 * @generated
	 * @ordered
	 */
	protected boolean gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige = GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE_EDEFAULT;

	/**
	 * This is true if the Gerichtliche Entscheidung Elterliche Sorge Auch Vorlaeufige attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet;

	/**
	 * The cached value of the '{@link #getNachweise() <em>Nachweise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweise()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweise;

	/**
	 * The default value of the '{@link #isMutterZumZeitpunktDerGeburtVerheiratet() <em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterZumZeitpunktDerGeburtVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMutterZumZeitpunktDerGeburtVerheiratet() <em>Mutter Zum Zeitpunkt Der Geburt Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutterZumZeitpunktDerGeburtVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected boolean mutterZumZeitpunktDerGeburtVerheiratet = MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET_EDEFAULT;

	/**
	 * This is true if the Mutter Zum Zeitpunkt Der Geburt Verheiratet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mutterZumZeitpunktDerGeburtVerheiratetESet;

	/**
	 * The default value of the '{@link #isGemeinsameSorgeerklaerung() <em>Gemeinsame Sorgeerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGemeinsameSorgeerklaerung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GEMEINSAME_SORGEERKLAERUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGemeinsameSorgeerklaerung() <em>Gemeinsame Sorgeerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGemeinsameSorgeerklaerung()
	 * @generated
	 * @ordered
	 */
	protected boolean gemeinsameSorgeerklaerung = GEMEINSAME_SORGEERKLAERUNG_EDEFAULT;

	/**
	 * This is true if the Gemeinsame Sorgeerklaerung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gemeinsameSorgeerklaerungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZusatzangabenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeburtPackage.Literals.ZUSATZANGABEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMutterIstWarMitVaterVerheiratet() {
		return mutterIstWarMitVaterVerheiratet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterIstWarMitVaterVerheiratet(boolean newMutterIstWarMitVaterVerheiratet) {
		boolean oldMutterIstWarMitVaterVerheiratet = mutterIstWarMitVaterVerheiratet;
		mutterIstWarMitVaterVerheiratet = newMutterIstWarMitVaterVerheiratet;
		boolean oldMutterIstWarMitVaterVerheiratetESet = mutterIstWarMitVaterVerheiratetESet;
		mutterIstWarMitVaterVerheiratetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_IST_WAR_MIT_VATER_VERHEIRATET, oldMutterIstWarMitVaterVerheiratet, mutterIstWarMitVaterVerheiratet, !oldMutterIstWarMitVaterVerheiratetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMutterIstWarMitVaterVerheiratet() {
		boolean oldMutterIstWarMitVaterVerheiratet = mutterIstWarMitVaterVerheiratet;
		boolean oldMutterIstWarMitVaterVerheiratetESet = mutterIstWarMitVaterVerheiratetESet;
		mutterIstWarMitVaterVerheiratet = MUTTER_IST_WAR_MIT_VATER_VERHEIRATET_EDEFAULT;
		mutterIstWarMitVaterVerheiratetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_IST_WAR_MIT_VATER_VERHEIRATET, oldMutterIstWarMitVaterVerheiratet, MUTTER_IST_WAR_MIT_VATER_VERHEIRATET_EDEFAULT, oldMutterIstWarMitVaterVerheiratetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMutterIstWarMitVaterVerheiratet() {
		return mutterIstWarMitVaterVerheiratetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige() {
		return gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige(boolean newGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige) {
		boolean oldGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige = gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige;
		gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige = newGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige;
		boolean oldGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet = gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet;
		gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ZUSATZANGABEN_TYPE__GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE, oldGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige, gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige, !oldGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige() {
		boolean oldGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige = gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige;
		boolean oldGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet = gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet;
		gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige = GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE_EDEFAULT;
		gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeburtPackage.ZUSATZANGABEN_TYPE__GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE, oldGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige, GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE_EDEFAULT, oldGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige() {
		return gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweise() {
		if (nachweise == null) {
			nachweise = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, GeburtPackage.ZUSATZANGABEN_TYPE__NACHWEISE);
		}
		return nachweise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMutterZumZeitpunktDerGeburtVerheiratet() {
		return mutterZumZeitpunktDerGeburtVerheiratet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterZumZeitpunktDerGeburtVerheiratet(boolean newMutterZumZeitpunktDerGeburtVerheiratet) {
		boolean oldMutterZumZeitpunktDerGeburtVerheiratet = mutterZumZeitpunktDerGeburtVerheiratet;
		mutterZumZeitpunktDerGeburtVerheiratet = newMutterZumZeitpunktDerGeburtVerheiratet;
		boolean oldMutterZumZeitpunktDerGeburtVerheiratetESet = mutterZumZeitpunktDerGeburtVerheiratetESet;
		mutterZumZeitpunktDerGeburtVerheiratetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET, oldMutterZumZeitpunktDerGeburtVerheiratet, mutterZumZeitpunktDerGeburtVerheiratet, !oldMutterZumZeitpunktDerGeburtVerheiratetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMutterZumZeitpunktDerGeburtVerheiratet() {
		boolean oldMutterZumZeitpunktDerGeburtVerheiratet = mutterZumZeitpunktDerGeburtVerheiratet;
		boolean oldMutterZumZeitpunktDerGeburtVerheiratetESet = mutterZumZeitpunktDerGeburtVerheiratetESet;
		mutterZumZeitpunktDerGeburtVerheiratet = MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET_EDEFAULT;
		mutterZumZeitpunktDerGeburtVerheiratetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET, oldMutterZumZeitpunktDerGeburtVerheiratet, MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET_EDEFAULT, oldMutterZumZeitpunktDerGeburtVerheiratetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMutterZumZeitpunktDerGeburtVerheiratet() {
		return mutterZumZeitpunktDerGeburtVerheiratetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGemeinsameSorgeerklaerung() {
		return gemeinsameSorgeerklaerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGemeinsameSorgeerklaerung(boolean newGemeinsameSorgeerklaerung) {
		boolean oldGemeinsameSorgeerklaerung = gemeinsameSorgeerklaerung;
		gemeinsameSorgeerklaerung = newGemeinsameSorgeerklaerung;
		boolean oldGemeinsameSorgeerklaerungESet = gemeinsameSorgeerklaerungESet;
		gemeinsameSorgeerklaerungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ZUSATZANGABEN_TYPE__GEMEINSAME_SORGEERKLAERUNG, oldGemeinsameSorgeerklaerung, gemeinsameSorgeerklaerung, !oldGemeinsameSorgeerklaerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGemeinsameSorgeerklaerung() {
		boolean oldGemeinsameSorgeerklaerung = gemeinsameSorgeerklaerung;
		boolean oldGemeinsameSorgeerklaerungESet = gemeinsameSorgeerklaerungESet;
		gemeinsameSorgeerklaerung = GEMEINSAME_SORGEERKLAERUNG_EDEFAULT;
		gemeinsameSorgeerklaerungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeburtPackage.ZUSATZANGABEN_TYPE__GEMEINSAME_SORGEERKLAERUNG, oldGemeinsameSorgeerklaerung, GEMEINSAME_SORGEERKLAERUNG_EDEFAULT, oldGemeinsameSorgeerklaerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGemeinsameSorgeerklaerung() {
		return gemeinsameSorgeerklaerungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.ZUSATZANGABEN_TYPE__NACHWEISE:
				return ((InternalEList<?>)getNachweise()).basicRemove(otherEnd, msgs);
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
			case GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_IST_WAR_MIT_VATER_VERHEIRATET:
				return isMutterIstWarMitVaterVerheiratet();
			case GeburtPackage.ZUSATZANGABEN_TYPE__GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE:
				return isGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige();
			case GeburtPackage.ZUSATZANGABEN_TYPE__NACHWEISE:
				return getNachweise();
			case GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET:
				return isMutterZumZeitpunktDerGeburtVerheiratet();
			case GeburtPackage.ZUSATZANGABEN_TYPE__GEMEINSAME_SORGEERKLAERUNG:
				return isGemeinsameSorgeerklaerung();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_IST_WAR_MIT_VATER_VERHEIRATET:
				setMutterIstWarMitVaterVerheiratet((Boolean)newValue);
				return;
			case GeburtPackage.ZUSATZANGABEN_TYPE__GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE:
				setGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige((Boolean)newValue);
				return;
			case GeburtPackage.ZUSATZANGABEN_TYPE__NACHWEISE:
				getNachweise().clear();
				getNachweise().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET:
				setMutterZumZeitpunktDerGeburtVerheiratet((Boolean)newValue);
				return;
			case GeburtPackage.ZUSATZANGABEN_TYPE__GEMEINSAME_SORGEERKLAERUNG:
				setGemeinsameSorgeerklaerung((Boolean)newValue);
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
			case GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_IST_WAR_MIT_VATER_VERHEIRATET:
				unsetMutterIstWarMitVaterVerheiratet();
				return;
			case GeburtPackage.ZUSATZANGABEN_TYPE__GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE:
				unsetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige();
				return;
			case GeburtPackage.ZUSATZANGABEN_TYPE__NACHWEISE:
				getNachweise().clear();
				return;
			case GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET:
				unsetMutterZumZeitpunktDerGeburtVerheiratet();
				return;
			case GeburtPackage.ZUSATZANGABEN_TYPE__GEMEINSAME_SORGEERKLAERUNG:
				unsetGemeinsameSorgeerklaerung();
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
			case GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_IST_WAR_MIT_VATER_VERHEIRATET:
				return isSetMutterIstWarMitVaterVerheiratet();
			case GeburtPackage.ZUSATZANGABEN_TYPE__GERICHTLICHE_ENTSCHEIDUNG_ELTERLICHE_SORGE_AUCH_VORLAEUFIGE:
				return isSetGerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige();
			case GeburtPackage.ZUSATZANGABEN_TYPE__NACHWEISE:
				return nachweise != null && !nachweise.isEmpty();
			case GeburtPackage.ZUSATZANGABEN_TYPE__MUTTER_ZUM_ZEITPUNKT_DER_GEBURT_VERHEIRATET:
				return isSetMutterZumZeitpunktDerGeburtVerheiratet();
			case GeburtPackage.ZUSATZANGABEN_TYPE__GEMEINSAME_SORGEERKLAERUNG:
				return isSetGemeinsameSorgeerklaerung();
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
		result.append(" (mutterIstWarMitVaterVerheiratet: ");
		if (mutterIstWarMitVaterVerheiratetESet) result.append(mutterIstWarMitVaterVerheiratet); else result.append("<unset>");
		result.append(", gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige: ");
		if (gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufigeESet) result.append(gerichtlicheEntscheidungElterlicheSorgeAuchVorlaeufige); else result.append("<unset>");
		result.append(", mutterZumZeitpunktDerGeburtVerheiratet: ");
		if (mutterZumZeitpunktDerGeburtVerheiratetESet) result.append(mutterZumZeitpunktDerGeburtVerheiratet); else result.append("<unset>");
		result.append(", gemeinsameSorgeerklaerung: ");
		if (gemeinsameSorgeerklaerungESet) result.append(gemeinsameSorgeerklaerung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ZusatzangabenTypeImpl
