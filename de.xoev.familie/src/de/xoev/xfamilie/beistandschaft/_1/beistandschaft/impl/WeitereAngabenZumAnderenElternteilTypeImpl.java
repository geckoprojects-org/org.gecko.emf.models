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

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeEinkommenAndererElternteilType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType;

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
 * An implementation of the model object '<em><b>Weitere Angaben Zum Anderen Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl#isBerufausausbildung <em>Berufausausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl#getAngabenBerufsausbildung <em>Angaben Berufsausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl#isEinkommensverhaeltnisse <em>Einkommensverhaeltnisse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl#getNettoeinkommen <em>Nettoeinkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl#getEinkommen <em>Einkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl#isWeitereKinder <em>Weitere Kinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl#isWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereAngabenZumAnderenElternteilTypeImpl#getWeitereKinderAngaben <em>Weitere Kinder Angaben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeitereAngabenZumAnderenElternteilTypeImpl extends MinimalEObjectImpl.Container implements WeitereAngabenZumAnderenElternteilType {
	/**
	 * The default value of the '{@link #isBerufausausbildung() <em>Berufausausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBerufausausbildung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BERUFAUSAUSBILDUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBerufausausbildung() <em>Berufausausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBerufausausbildung()
	 * @generated
	 * @ordered
	 */
	protected boolean berufausausbildung = BERUFAUSAUSBILDUNG_EDEFAULT;

	/**
	 * This is true if the Berufausausbildung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean berufausausbildungESet;

	/**
	 * The default value of the '{@link #getAngabenBerufsausbildung() <em>Angaben Berufsausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenBerufsausbildung()
	 * @generated
	 * @ordered
	 */
	protected static final String ANGABEN_BERUFSAUSBILDUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngabenBerufsausbildung() <em>Angaben Berufsausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenBerufsausbildung()
	 * @generated
	 * @ordered
	 */
	protected String angabenBerufsausbildung = ANGABEN_BERUFSAUSBILDUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #isEinkommensverhaeltnisse() <em>Einkommensverhaeltnisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommensverhaeltnisse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINKOMMENSVERHAELTNISSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinkommensverhaeltnisse() <em>Einkommensverhaeltnisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkommensverhaeltnisse()
	 * @generated
	 * @ordered
	 */
	protected boolean einkommensverhaeltnisse = EINKOMMENSVERHAELTNISSE_EDEFAULT;

	/**
	 * This is true if the Einkommensverhaeltnisse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkommensverhaeltnisseESet;

	/**
	 * The default value of the '{@link #getNettoeinkommen() <em>Nettoeinkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNettoeinkommen()
	 * @generated
	 * @ordered
	 */
	protected static final float NETTOEINKOMMEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNettoeinkommen() <em>Nettoeinkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNettoeinkommen()
	 * @generated
	 * @ordered
	 */
	protected float nettoeinkommen = NETTOEINKOMMEN_EDEFAULT;

	/**
	 * This is true if the Nettoeinkommen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nettoeinkommenESet;

	/**
	 * The cached value of the '{@link #getEinkommen() <em>Einkommen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommen()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeEinkommenAndererElternteilType> einkommen;

	/**
	 * The default value of the '{@link #isWeitereKinder() <em>Weitere Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeitereKinder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEITERE_KINDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWeitereKinder() <em>Weitere Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeitereKinder()
	 * @generated
	 * @ordered
	 */
	protected boolean weitereKinder = WEITERE_KINDER_EDEFAULT;

	/**
	 * This is true if the Weitere Kinder attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weitereKinderESet;

	/**
	 * The default value of the '{@link #isWeitereKinderImHaushalt() <em>Weitere Kinder Im Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeitereKinderImHaushalt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEITERE_KINDER_IM_HAUSHALT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWeitereKinderImHaushalt() <em>Weitere Kinder Im Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeitereKinderImHaushalt()
	 * @generated
	 * @ordered
	 */
	protected boolean weitereKinderImHaushalt = WEITERE_KINDER_IM_HAUSHALT_EDEFAULT;

	/**
	 * This is true if the Weitere Kinder Im Haushalt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weitereKinderImHaushaltESet;

	/**
	 * The cached value of the '{@link #getWeitereKinderAngaben() <em>Weitere Kinder Angaben</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereKinderAngaben()
	 * @generated
	 * @ordered
	 */
	protected EList<WeitereKinderType> weitereKinderAngaben;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeitereAngabenZumAnderenElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBerufausausbildung() {
		return berufausausbildung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBerufausausbildung(boolean newBerufausausbildung) {
		boolean oldBerufausausbildung = berufausausbildung;
		berufausausbildung = newBerufausausbildung;
		boolean oldBerufausausbildungESet = berufausausbildungESet;
		berufausausbildungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__BERUFAUSAUSBILDUNG, oldBerufausausbildung, berufausausbildung, !oldBerufausausbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBerufausausbildung() {
		boolean oldBerufausausbildung = berufausausbildung;
		boolean oldBerufausausbildungESet = berufausausbildungESet;
		berufausausbildung = BERUFAUSAUSBILDUNG_EDEFAULT;
		berufausausbildungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__BERUFAUSAUSBILDUNG, oldBerufausausbildung, BERUFAUSAUSBILDUNG_EDEFAULT, oldBerufausausbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBerufausausbildung() {
		return berufausausbildungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAngabenBerufsausbildung() {
		return angabenBerufsausbildung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngabenBerufsausbildung(String newAngabenBerufsausbildung) {
		String oldAngabenBerufsausbildung = angabenBerufsausbildung;
		angabenBerufsausbildung = newAngabenBerufsausbildung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__ANGABEN_BERUFSAUSBILDUNG, oldAngabenBerufsausbildung, angabenBerufsausbildung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinkommensverhaeltnisse() {
		return einkommensverhaeltnisse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkommensverhaeltnisse(boolean newEinkommensverhaeltnisse) {
		boolean oldEinkommensverhaeltnisse = einkommensverhaeltnisse;
		einkommensverhaeltnisse = newEinkommensverhaeltnisse;
		boolean oldEinkommensverhaeltnisseESet = einkommensverhaeltnisseESet;
		einkommensverhaeltnisseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMENSVERHAELTNISSE, oldEinkommensverhaeltnisse, einkommensverhaeltnisse, !oldEinkommensverhaeltnisseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkommensverhaeltnisse() {
		boolean oldEinkommensverhaeltnisse = einkommensverhaeltnisse;
		boolean oldEinkommensverhaeltnisseESet = einkommensverhaeltnisseESet;
		einkommensverhaeltnisse = EINKOMMENSVERHAELTNISSE_EDEFAULT;
		einkommensverhaeltnisseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMENSVERHAELTNISSE, oldEinkommensverhaeltnisse, EINKOMMENSVERHAELTNISSE_EDEFAULT, oldEinkommensverhaeltnisseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkommensverhaeltnisse() {
		return einkommensverhaeltnisseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getNettoeinkommen() {
		return nettoeinkommen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNettoeinkommen(float newNettoeinkommen) {
		float oldNettoeinkommen = nettoeinkommen;
		nettoeinkommen = newNettoeinkommen;
		boolean oldNettoeinkommenESet = nettoeinkommenESet;
		nettoeinkommenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__NETTOEINKOMMEN, oldNettoeinkommen, nettoeinkommen, !oldNettoeinkommenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNettoeinkommen() {
		float oldNettoeinkommen = nettoeinkommen;
		boolean oldNettoeinkommenESet = nettoeinkommenESet;
		nettoeinkommen = NETTOEINKOMMEN_EDEFAULT;
		nettoeinkommenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__NETTOEINKOMMEN, oldNettoeinkommen, NETTOEINKOMMEN_EDEFAULT, oldNettoeinkommenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNettoeinkommen() {
		return nettoeinkommenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeEinkommenAndererElternteilType> getEinkommen() {
		if (einkommen == null) {
			einkommen = new EObjectContainmentEList<CodeEinkommenAndererElternteilType>(CodeEinkommenAndererElternteilType.class, this, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMEN);
		}
		return einkommen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWeitereKinder() {
		return weitereKinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeitereKinder(boolean newWeitereKinder) {
		boolean oldWeitereKinder = weitereKinder;
		weitereKinder = newWeitereKinder;
		boolean oldWeitereKinderESet = weitereKinderESet;
		weitereKinderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER, oldWeitereKinder, weitereKinder, !oldWeitereKinderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWeitereKinder() {
		boolean oldWeitereKinder = weitereKinder;
		boolean oldWeitereKinderESet = weitereKinderESet;
		weitereKinder = WEITERE_KINDER_EDEFAULT;
		weitereKinderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER, oldWeitereKinder, WEITERE_KINDER_EDEFAULT, oldWeitereKinderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWeitereKinder() {
		return weitereKinderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWeitereKinderImHaushalt() {
		return weitereKinderImHaushalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeitereKinderImHaushalt(boolean newWeitereKinderImHaushalt) {
		boolean oldWeitereKinderImHaushalt = weitereKinderImHaushalt;
		weitereKinderImHaushalt = newWeitereKinderImHaushalt;
		boolean oldWeitereKinderImHaushaltESet = weitereKinderImHaushaltESet;
		weitereKinderImHaushaltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_IM_HAUSHALT, oldWeitereKinderImHaushalt, weitereKinderImHaushalt, !oldWeitereKinderImHaushaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWeitereKinderImHaushalt() {
		boolean oldWeitereKinderImHaushalt = weitereKinderImHaushalt;
		boolean oldWeitereKinderImHaushaltESet = weitereKinderImHaushaltESet;
		weitereKinderImHaushalt = WEITERE_KINDER_IM_HAUSHALT_EDEFAULT;
		weitereKinderImHaushaltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_IM_HAUSHALT, oldWeitereKinderImHaushalt, WEITERE_KINDER_IM_HAUSHALT_EDEFAULT, oldWeitereKinderImHaushaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWeitereKinderImHaushalt() {
		return weitereKinderImHaushaltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeitereKinderType> getWeitereKinderAngaben() {
		if (weitereKinderAngaben == null) {
			weitereKinderAngaben = new EObjectContainmentEList<WeitereKinderType>(WeitereKinderType.class, this, BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_ANGABEN);
		}
		return weitereKinderAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMEN:
				return ((InternalEList<?>)getEinkommen()).basicRemove(otherEnd, msgs);
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_ANGABEN:
				return ((InternalEList<?>)getWeitereKinderAngaben()).basicRemove(otherEnd, msgs);
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
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__BERUFAUSAUSBILDUNG:
				return isBerufausausbildung();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__ANGABEN_BERUFSAUSBILDUNG:
				return getAngabenBerufsausbildung();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMENSVERHAELTNISSE:
				return isEinkommensverhaeltnisse();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__NETTOEINKOMMEN:
				return getNettoeinkommen();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMEN:
				return getEinkommen();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER:
				return isWeitereKinder();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				return isWeitereKinderImHaushalt();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_ANGABEN:
				return getWeitereKinderAngaben();
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
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__BERUFAUSAUSBILDUNG:
				setBerufausausbildung((Boolean)newValue);
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__ANGABEN_BERUFSAUSBILDUNG:
				setAngabenBerufsausbildung((String)newValue);
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMENSVERHAELTNISSE:
				setEinkommensverhaeltnisse((Boolean)newValue);
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__NETTOEINKOMMEN:
				setNettoeinkommen((Float)newValue);
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMEN:
				getEinkommen().clear();
				getEinkommen().addAll((Collection<? extends CodeEinkommenAndererElternteilType>)newValue);
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER:
				setWeitereKinder((Boolean)newValue);
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				setWeitereKinderImHaushalt((Boolean)newValue);
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_ANGABEN:
				getWeitereKinderAngaben().clear();
				getWeitereKinderAngaben().addAll((Collection<? extends WeitereKinderType>)newValue);
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
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__BERUFAUSAUSBILDUNG:
				unsetBerufausausbildung();
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__ANGABEN_BERUFSAUSBILDUNG:
				setAngabenBerufsausbildung(ANGABEN_BERUFSAUSBILDUNG_EDEFAULT);
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMENSVERHAELTNISSE:
				unsetEinkommensverhaeltnisse();
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__NETTOEINKOMMEN:
				unsetNettoeinkommen();
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMEN:
				getEinkommen().clear();
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER:
				unsetWeitereKinder();
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				unsetWeitereKinderImHaushalt();
				return;
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_ANGABEN:
				getWeitereKinderAngaben().clear();
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
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__BERUFAUSAUSBILDUNG:
				return isSetBerufausausbildung();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__ANGABEN_BERUFSAUSBILDUNG:
				return ANGABEN_BERUFSAUSBILDUNG_EDEFAULT == null ? angabenBerufsausbildung != null : !ANGABEN_BERUFSAUSBILDUNG_EDEFAULT.equals(angabenBerufsausbildung);
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMENSVERHAELTNISSE:
				return isSetEinkommensverhaeltnisse();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__NETTOEINKOMMEN:
				return isSetNettoeinkommen();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__EINKOMMEN:
				return einkommen != null && !einkommen.isEmpty();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER:
				return isSetWeitereKinder();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				return isSetWeitereKinderImHaushalt();
			case BeistandschaftPackage.WEITERE_ANGABEN_ZUM_ANDEREN_ELTERNTEIL_TYPE__WEITERE_KINDER_ANGABEN:
				return weitereKinderAngaben != null && !weitereKinderAngaben.isEmpty();
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
		result.append(" (berufausausbildung: ");
		if (berufausausbildungESet) result.append(berufausausbildung); else result.append("<unset>");
		result.append(", angabenBerufsausbildung: ");
		result.append(angabenBerufsausbildung);
		result.append(", einkommensverhaeltnisse: ");
		if (einkommensverhaeltnisseESet) result.append(einkommensverhaeltnisse); else result.append("<unset>");
		result.append(", nettoeinkommen: ");
		if (nettoeinkommenESet) result.append(nettoeinkommen); else result.append("<unset>");
		result.append(", weitereKinder: ");
		if (weitereKinderESet) result.append(weitereKinder); else result.append("<unset>");
		result.append(", weitereKinderImHaushalt: ");
		if (weitereKinderImHaushaltESet) result.append(weitereKinderImHaushalt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WeitereAngabenZumAnderenElternteilTypeImpl
