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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.GeringesEinkommenCovid19Type;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Geringes Einkommen Covid19 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GeringesEinkommenCovid19TypeImpl#isGeringesEinkommenCovid19 <em>Geringes Einkommen Covid19</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GeringesEinkommenCovid19TypeImpl#isAntragAusklammerungMonateNichtselbststaendige <em>Antrag Ausklammerung Monate Nichtselbststaendige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GeringesEinkommenCovid19TypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GeringesEinkommenCovid19TypeImpl#isAntragVerschiebungBemessungszeitraumesSelbststaendige <em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GeringesEinkommenCovid19TypeImpl#getVerschiebungBemessungszeitraumesSelbststaendige <em>Verschiebung Bemessungszeitraumes Selbststaendige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.GeringesEinkommenCovid19TypeImpl#getNachweisGeringesEinkommenCovid19 <em>Nachweis Geringes Einkommen Covid19</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeringesEinkommenCovid19TypeImpl extends MinimalEObjectImpl.Container implements GeringesEinkommenCovid19Type {
	/**
	 * The default value of the '{@link #isGeringesEinkommenCovid19() <em>Geringes Einkommen Covid19</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeringesEinkommenCovid19()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GERINGES_EINKOMMEN_COVID19_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeringesEinkommenCovid19() <em>Geringes Einkommen Covid19</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeringesEinkommenCovid19()
	 * @generated
	 * @ordered
	 */
	protected boolean geringesEinkommenCovid19 = GERINGES_EINKOMMEN_COVID19_EDEFAULT;

	/**
	 * This is true if the Geringes Einkommen Covid19 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geringesEinkommenCovid19ESet;

	/**
	 * The default value of the '{@link #isAntragAusklammerungMonateNichtselbststaendige() <em>Antrag Ausklammerung Monate Nichtselbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragAusklammerungMonateNichtselbststaendige()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAntragAusklammerungMonateNichtselbststaendige() <em>Antrag Ausklammerung Monate Nichtselbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragAusklammerungMonateNichtselbststaendige()
	 * @generated
	 * @ordered
	 */
	protected boolean antragAusklammerungMonateNichtselbststaendige = ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE_EDEFAULT;

	/**
	 * This is true if the Antrag Ausklammerung Monate Nichtselbststaendige attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean antragAusklammerungMonateNichtselbststaendigeESet;

	/**
	 * The cached value of the '{@link #getZeitraum() <em>Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraum;

	/**
	 * The default value of the '{@link #isAntragVerschiebungBemessungszeitraumesSelbststaendige() <em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAntragVerschiebungBemessungszeitraumesSelbststaendige() <em>Antrag Verschiebung Bemessungszeitraumes Selbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragVerschiebungBemessungszeitraumesSelbststaendige()
	 * @generated
	 * @ordered
	 */
	protected boolean antragVerschiebungBemessungszeitraumesSelbststaendige = ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE_EDEFAULT;

	/**
	 * This is true if the Antrag Verschiebung Bemessungszeitraumes Selbststaendige attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean antragVerschiebungBemessungszeitraumesSelbststaendigeESet;

	/**
	 * The default value of the '{@link #getVerschiebungBemessungszeitraumesSelbststaendige() <em>Verschiebung Bemessungszeitraumes Selbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerschiebungBemessungszeitraumesSelbststaendige()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerschiebungBemessungszeitraumesSelbststaendige() <em>Verschiebung Bemessungszeitraumes Selbststaendige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerschiebungBemessungszeitraumesSelbststaendige()
	 * @generated
	 * @ordered
	 */
	protected BigInteger verschiebungBemessungszeitraumesSelbststaendige = VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachweisGeringesEinkommenCovid19() <em>Nachweis Geringes Einkommen Covid19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisGeringesEinkommenCovid19()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisGeringesEinkommenCovid19;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeringesEinkommenCovid19TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getGeringesEinkommenCovid19Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGeringesEinkommenCovid19() {
		return geringesEinkommenCovid19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeringesEinkommenCovid19(boolean newGeringesEinkommenCovid19) {
		boolean oldGeringesEinkommenCovid19 = geringesEinkommenCovid19;
		geringesEinkommenCovid19 = newGeringesEinkommenCovid19;
		boolean oldGeringesEinkommenCovid19ESet = geringesEinkommenCovid19ESet;
		geringesEinkommenCovid19ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__GERINGES_EINKOMMEN_COVID19, oldGeringesEinkommenCovid19, geringesEinkommenCovid19, !oldGeringesEinkommenCovid19ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGeringesEinkommenCovid19() {
		boolean oldGeringesEinkommenCovid19 = geringesEinkommenCovid19;
		boolean oldGeringesEinkommenCovid19ESet = geringesEinkommenCovid19ESet;
		geringesEinkommenCovid19 = GERINGES_EINKOMMEN_COVID19_EDEFAULT;
		geringesEinkommenCovid19ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__GERINGES_EINKOMMEN_COVID19, oldGeringesEinkommenCovid19, GERINGES_EINKOMMEN_COVID19_EDEFAULT, oldGeringesEinkommenCovid19ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGeringesEinkommenCovid19() {
		return geringesEinkommenCovid19ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAntragAusklammerungMonateNichtselbststaendige() {
		return antragAusklammerungMonateNichtselbststaendige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntragAusklammerungMonateNichtselbststaendige(boolean newAntragAusklammerungMonateNichtselbststaendige) {
		boolean oldAntragAusklammerungMonateNichtselbststaendige = antragAusklammerungMonateNichtselbststaendige;
		antragAusklammerungMonateNichtselbststaendige = newAntragAusklammerungMonateNichtselbststaendige;
		boolean oldAntragAusklammerungMonateNichtselbststaendigeESet = antragAusklammerungMonateNichtselbststaendigeESet;
		antragAusklammerungMonateNichtselbststaendigeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE, oldAntragAusklammerungMonateNichtselbststaendige, antragAusklammerungMonateNichtselbststaendige, !oldAntragAusklammerungMonateNichtselbststaendigeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAntragAusklammerungMonateNichtselbststaendige() {
		boolean oldAntragAusklammerungMonateNichtselbststaendige = antragAusklammerungMonateNichtselbststaendige;
		boolean oldAntragAusklammerungMonateNichtselbststaendigeESet = antragAusklammerungMonateNichtselbststaendigeESet;
		antragAusklammerungMonateNichtselbststaendige = ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE_EDEFAULT;
		antragAusklammerungMonateNichtselbststaendigeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE, oldAntragAusklammerungMonateNichtselbststaendige, ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE_EDEFAULT, oldAntragAusklammerungMonateNichtselbststaendigeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAntragAusklammerungMonateNichtselbststaendige() {
		return antragAusklammerungMonateNichtselbststaendigeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraum() {
		if (zeitraum == null) {
			zeitraum = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ZEITRAUM);
		}
		return zeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAntragVerschiebungBemessungszeitraumesSelbststaendige() {
		return antragVerschiebungBemessungszeitraumesSelbststaendige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntragVerschiebungBemessungszeitraumesSelbststaendige(boolean newAntragVerschiebungBemessungszeitraumesSelbststaendige) {
		boolean oldAntragVerschiebungBemessungszeitraumesSelbststaendige = antragVerschiebungBemessungszeitraumesSelbststaendige;
		antragVerschiebungBemessungszeitraumesSelbststaendige = newAntragVerschiebungBemessungszeitraumesSelbststaendige;
		boolean oldAntragVerschiebungBemessungszeitraumesSelbststaendigeESet = antragVerschiebungBemessungszeitraumesSelbststaendigeESet;
		antragVerschiebungBemessungszeitraumesSelbststaendigeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE, oldAntragVerschiebungBemessungszeitraumesSelbststaendige, antragVerschiebungBemessungszeitraumesSelbststaendige, !oldAntragVerschiebungBemessungszeitraumesSelbststaendigeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAntragVerschiebungBemessungszeitraumesSelbststaendige() {
		boolean oldAntragVerschiebungBemessungszeitraumesSelbststaendige = antragVerschiebungBemessungszeitraumesSelbststaendige;
		boolean oldAntragVerschiebungBemessungszeitraumesSelbststaendigeESet = antragVerschiebungBemessungszeitraumesSelbststaendigeESet;
		antragVerschiebungBemessungszeitraumesSelbststaendige = ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE_EDEFAULT;
		antragVerschiebungBemessungszeitraumesSelbststaendigeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE, oldAntragVerschiebungBemessungszeitraumesSelbststaendige, ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE_EDEFAULT, oldAntragVerschiebungBemessungszeitraumesSelbststaendigeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAntragVerschiebungBemessungszeitraumesSelbststaendige() {
		return antragVerschiebungBemessungszeitraumesSelbststaendigeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getVerschiebungBemessungszeitraumesSelbststaendige() {
		return verschiebungBemessungszeitraumesSelbststaendige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerschiebungBemessungszeitraumesSelbststaendige(BigInteger newVerschiebungBemessungszeitraumesSelbststaendige) {
		BigInteger oldVerschiebungBemessungszeitraumesSelbststaendige = verschiebungBemessungszeitraumesSelbststaendige;
		verschiebungBemessungszeitraumesSelbststaendige = newVerschiebungBemessungszeitraumesSelbststaendige;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE, oldVerschiebungBemessungszeitraumesSelbststaendige, verschiebungBemessungszeitraumesSelbststaendige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisGeringesEinkommenCovid19() {
		if (nachweisGeringesEinkommenCovid19 == null) {
			nachweisGeringesEinkommenCovid19 = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__NACHWEIS_GERINGES_EINKOMMEN_COVID19);
		}
		return nachweisGeringesEinkommenCovid19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ZEITRAUM:
				return ((InternalEList<?>)getZeitraum()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__NACHWEIS_GERINGES_EINKOMMEN_COVID19:
				return ((InternalEList<?>)getNachweisGeringesEinkommenCovid19()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__GERINGES_EINKOMMEN_COVID19:
				return isGeringesEinkommenCovid19();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE:
				return isAntragAusklammerungMonateNichtselbststaendige();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ZEITRAUM:
				return getZeitraum();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE:
				return isAntragVerschiebungBemessungszeitraumesSelbststaendige();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE:
				return getVerschiebungBemessungszeitraumesSelbststaendige();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__NACHWEIS_GERINGES_EINKOMMEN_COVID19:
				return getNachweisGeringesEinkommenCovid19();
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
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__GERINGES_EINKOMMEN_COVID19:
				setGeringesEinkommenCovid19((Boolean)newValue);
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE:
				setAntragAusklammerungMonateNichtselbststaendige((Boolean)newValue);
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ZEITRAUM:
				getZeitraum().clear();
				getZeitraum().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE:
				setAntragVerschiebungBemessungszeitraumesSelbststaendige((Boolean)newValue);
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE:
				setVerschiebungBemessungszeitraumesSelbststaendige((BigInteger)newValue);
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__NACHWEIS_GERINGES_EINKOMMEN_COVID19:
				getNachweisGeringesEinkommenCovid19().clear();
				getNachweisGeringesEinkommenCovid19().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__GERINGES_EINKOMMEN_COVID19:
				unsetGeringesEinkommenCovid19();
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE:
				unsetAntragAusklammerungMonateNichtselbststaendige();
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ZEITRAUM:
				getZeitraum().clear();
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE:
				unsetAntragVerschiebungBemessungszeitraumesSelbststaendige();
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE:
				setVerschiebungBemessungszeitraumesSelbststaendige(VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE_EDEFAULT);
				return;
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__NACHWEIS_GERINGES_EINKOMMEN_COVID19:
				getNachweisGeringesEinkommenCovid19().clear();
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
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__GERINGES_EINKOMMEN_COVID19:
				return isSetGeringesEinkommenCovid19();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_AUSKLAMMERUNG_MONATE_NICHTSELBSTSTAENDIGE:
				return isSetAntragAusklammerungMonateNichtselbststaendige();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ZEITRAUM:
				return zeitraum != null && !zeitraum.isEmpty();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__ANTRAG_VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE:
				return isSetAntragVerschiebungBemessungszeitraumesSelbststaendige();
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE:
				return VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE_EDEFAULT == null ? verschiebungBemessungszeitraumesSelbststaendige != null : !VERSCHIEBUNG_BEMESSUNGSZEITRAUMES_SELBSTSTAENDIGE_EDEFAULT.equals(verschiebungBemessungszeitraumesSelbststaendige);
			case ElterngeldPackage.GERINGES_EINKOMMEN_COVID19_TYPE__NACHWEIS_GERINGES_EINKOMMEN_COVID19:
				return nachweisGeringesEinkommenCovid19 != null && !nachweisGeringesEinkommenCovid19.isEmpty();
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
		result.append(" (geringesEinkommenCovid19: ");
		if (geringesEinkommenCovid19ESet) result.append(geringesEinkommenCovid19); else result.append("<unset>");
		result.append(", antragAusklammerungMonateNichtselbststaendige: ");
		if (antragAusklammerungMonateNichtselbststaendigeESet) result.append(antragAusklammerungMonateNichtselbststaendige); else result.append("<unset>");
		result.append(", antragVerschiebungBemessungszeitraumesSelbststaendige: ");
		if (antragVerschiebungBemessungszeitraumesSelbststaendigeESet) result.append(antragVerschiebungBemessungszeitraumesSelbststaendige); else result.append("<unset>");
		result.append(", verschiebungBemessungszeitraumesSelbststaendige: ");
		result.append(verschiebungBemessungszeitraumesSelbststaendige);
		result.append(')');
		return result.toString();
	}

} //GeringesEinkommenCovid19TypeImpl
