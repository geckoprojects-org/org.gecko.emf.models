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

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenspartnerschaftAntragstellendeBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lebenspartnerschaft Antragstellende Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl#getGetrenntLebend <em>Getrennt Lebend</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl#getLebenspartnerSeitSechsMonatenInAnstalt <em>Lebenspartner Seit Sechs Monaten In Anstalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl#getLebenspartnerIstNichtDerAndereElternteilName <em>Lebenspartner Ist Nicht Der Andere Elternteil Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl#getLebenspartnerIstNichtDerAndereElternteilAnschrift <em>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl#getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum <em>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl#getSteuerklasse <em>Steuerklasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl#getSteuerklasseNachweis <em>Steuerklasse Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LebenspartnerschaftAntragstellendeBasisTypeImpl#getSeitWann <em>Seit Wann</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LebenspartnerschaftAntragstellendeBasisTypeImpl extends MinimalEObjectImpl.Container implements LebenspartnerschaftAntragstellendeBasisType {
	/**
	 * The cached value of the '{@link #getGetrenntLebend() <em>Getrennt Lebend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetrenntLebend()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType getrenntLebend;

	/**
	 * The default value of the '{@link #getGetrenntLebendGrund() <em>Getrennt Lebend Grund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetrenntLebendGrund()
	 * @generated
	 * @ordered
	 */
	protected static final String GETRENNT_LEBEND_GRUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetrenntLebendGrund() <em>Getrennt Lebend Grund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetrenntLebendGrund()
	 * @generated
	 * @ordered
	 */
	protected String getrenntLebendGrund = GETRENNT_LEBEND_GRUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLebenspartnerSeitSechsMonatenInAnstalt() <em>Lebenspartner Seit Sechs Monaten In Anstalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebenspartnerSeitSechsMonatenInAnstalt()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType lebenspartnerSeitSechsMonatenInAnstalt;

	/**
	 * The cached value of the '{@link #getLebenspartnerIstNichtDerAndereElternteilName() <em>Lebenspartner Ist Nicht Der Andere Elternteil Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebenspartnerIstNichtDerAndereElternteilName()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType lebenspartnerIstNichtDerAndereElternteilName;

	/**
	 * The cached value of the '{@link #getLebenspartnerIstNichtDerAndereElternteilAnschrift() <em>Lebenspartner Ist Nicht Der Andere Elternteil Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebenspartnerIstNichtDerAndereElternteilAnschrift()
	 * @generated
	 * @ordered
	 */
	protected AnschriftOptionalType lebenspartnerIstNichtDerAndereElternteilAnschrift;

	/**
	 * The cached value of the '{@link #getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum() <em>Lebenspartner Ist Nicht Der Andere Elternteil Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType lebenspartnerIstNichtDerAndereElternteilGeburtsdatum;

	/**
	 * The default value of the '{@link #getSteuerklasse() <em>Steuerklasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteuerklasse()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STEUERKLASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSteuerklasse() <em>Steuerklasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteuerklasse()
	 * @generated
	 * @ordered
	 */
	protected BigInteger steuerklasse = STEUERKLASSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteuerklasseNachweis() <em>Steuerklasse Nachweis</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteuerklasseNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<String> steuerklasseNachweis;

	/**
	 * The default value of the '{@link #getSeitWann() <em>Seit Wann</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeitWann()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SEIT_WANN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeitWann() <em>Seit Wann</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeitWann()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar seitWann = SEIT_WANN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LebenspartnerschaftAntragstellendeBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getLebenspartnerschaftAntragstellendeBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getGetrenntLebend() {
		return getrenntLebend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetrenntLebend(TatsacheMitNachweisType newGetrenntLebend, NotificationChain msgs) {
		TatsacheMitNachweisType oldGetrenntLebend = getrenntLebend;
		getrenntLebend = newGetrenntLebend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND, oldGetrenntLebend, newGetrenntLebend);
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
	public void setGetrenntLebend(TatsacheMitNachweisType newGetrenntLebend) {
		if (newGetrenntLebend != getrenntLebend) {
			NotificationChain msgs = null;
			if (getrenntLebend != null)
				msgs = ((InternalEObject)getrenntLebend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND, null, msgs);
			if (newGetrenntLebend != null)
				msgs = ((InternalEObject)newGetrenntLebend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND, null, msgs);
			msgs = basicSetGetrenntLebend(newGetrenntLebend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND, newGetrenntLebend, newGetrenntLebend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGetrenntLebendGrund() {
		return getrenntLebendGrund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetrenntLebendGrund(String newGetrenntLebendGrund) {
		String oldGetrenntLebendGrund = getrenntLebendGrund;
		getrenntLebendGrund = newGetrenntLebendGrund;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND, oldGetrenntLebendGrund, getrenntLebendGrund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getLebenspartnerSeitSechsMonatenInAnstalt() {
		return lebenspartnerSeitSechsMonatenInAnstalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLebenspartnerSeitSechsMonatenInAnstalt(TatsacheMitNachweisType newLebenspartnerSeitSechsMonatenInAnstalt, NotificationChain msgs) {
		TatsacheMitNachweisType oldLebenspartnerSeitSechsMonatenInAnstalt = lebenspartnerSeitSechsMonatenInAnstalt;
		lebenspartnerSeitSechsMonatenInAnstalt = newLebenspartnerSeitSechsMonatenInAnstalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT, oldLebenspartnerSeitSechsMonatenInAnstalt, newLebenspartnerSeitSechsMonatenInAnstalt);
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
	public void setLebenspartnerSeitSechsMonatenInAnstalt(TatsacheMitNachweisType newLebenspartnerSeitSechsMonatenInAnstalt) {
		if (newLebenspartnerSeitSechsMonatenInAnstalt != lebenspartnerSeitSechsMonatenInAnstalt) {
			NotificationChain msgs = null;
			if (lebenspartnerSeitSechsMonatenInAnstalt != null)
				msgs = ((InternalEObject)lebenspartnerSeitSechsMonatenInAnstalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT, null, msgs);
			if (newLebenspartnerSeitSechsMonatenInAnstalt != null)
				msgs = ((InternalEObject)newLebenspartnerSeitSechsMonatenInAnstalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT, null, msgs);
			msgs = basicSetLebenspartnerSeitSechsMonatenInAnstalt(newLebenspartnerSeitSechsMonatenInAnstalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT, newLebenspartnerSeitSechsMonatenInAnstalt, newLebenspartnerSeitSechsMonatenInAnstalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getLebenspartnerIstNichtDerAndereElternteilName() {
		return lebenspartnerIstNichtDerAndereElternteilName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLebenspartnerIstNichtDerAndereElternteilName(NameNatuerlichePersonType newLebenspartnerIstNichtDerAndereElternteilName, NotificationChain msgs) {
		NameNatuerlichePersonType oldLebenspartnerIstNichtDerAndereElternteilName = lebenspartnerIstNichtDerAndereElternteilName;
		lebenspartnerIstNichtDerAndereElternteilName = newLebenspartnerIstNichtDerAndereElternteilName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME, oldLebenspartnerIstNichtDerAndereElternteilName, newLebenspartnerIstNichtDerAndereElternteilName);
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
	public void setLebenspartnerIstNichtDerAndereElternteilName(NameNatuerlichePersonType newLebenspartnerIstNichtDerAndereElternteilName) {
		if (newLebenspartnerIstNichtDerAndereElternteilName != lebenspartnerIstNichtDerAndereElternteilName) {
			NotificationChain msgs = null;
			if (lebenspartnerIstNichtDerAndereElternteilName != null)
				msgs = ((InternalEObject)lebenspartnerIstNichtDerAndereElternteilName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME, null, msgs);
			if (newLebenspartnerIstNichtDerAndereElternteilName != null)
				msgs = ((InternalEObject)newLebenspartnerIstNichtDerAndereElternteilName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME, null, msgs);
			msgs = basicSetLebenspartnerIstNichtDerAndereElternteilName(newLebenspartnerIstNichtDerAndereElternteilName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME, newLebenspartnerIstNichtDerAndereElternteilName, newLebenspartnerIstNichtDerAndereElternteilName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftOptionalType getLebenspartnerIstNichtDerAndereElternteilAnschrift() {
		return lebenspartnerIstNichtDerAndereElternteilAnschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLebenspartnerIstNichtDerAndereElternteilAnschrift(AnschriftOptionalType newLebenspartnerIstNichtDerAndereElternteilAnschrift, NotificationChain msgs) {
		AnschriftOptionalType oldLebenspartnerIstNichtDerAndereElternteilAnschrift = lebenspartnerIstNichtDerAndereElternteilAnschrift;
		lebenspartnerIstNichtDerAndereElternteilAnschrift = newLebenspartnerIstNichtDerAndereElternteilAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT, oldLebenspartnerIstNichtDerAndereElternteilAnschrift, newLebenspartnerIstNichtDerAndereElternteilAnschrift);
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
	public void setLebenspartnerIstNichtDerAndereElternteilAnschrift(AnschriftOptionalType newLebenspartnerIstNichtDerAndereElternteilAnschrift) {
		if (newLebenspartnerIstNichtDerAndereElternteilAnschrift != lebenspartnerIstNichtDerAndereElternteilAnschrift) {
			NotificationChain msgs = null;
			if (lebenspartnerIstNichtDerAndereElternteilAnschrift != null)
				msgs = ((InternalEObject)lebenspartnerIstNichtDerAndereElternteilAnschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT, null, msgs);
			if (newLebenspartnerIstNichtDerAndereElternteilAnschrift != null)
				msgs = ((InternalEObject)newLebenspartnerIstNichtDerAndereElternteilAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT, null, msgs);
			msgs = basicSetLebenspartnerIstNichtDerAndereElternteilAnschrift(newLebenspartnerIstNichtDerAndereElternteilAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT, newLebenspartnerIstNichtDerAndereElternteilAnschrift, newLebenspartnerIstNichtDerAndereElternteilAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum() {
		return lebenspartnerIstNichtDerAndereElternteilGeburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLebenspartnerIstNichtDerAndereElternteilGeburtsdatum(TeilbekanntesDatumType newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum, NotificationChain msgs) {
		TeilbekanntesDatumType oldLebenspartnerIstNichtDerAndereElternteilGeburtsdatum = lebenspartnerIstNichtDerAndereElternteilGeburtsdatum;
		lebenspartnerIstNichtDerAndereElternteilGeburtsdatum = newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM, oldLebenspartnerIstNichtDerAndereElternteilGeburtsdatum, newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum);
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
	public void setLebenspartnerIstNichtDerAndereElternteilGeburtsdatum(TeilbekanntesDatumType newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum) {
		if (newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum != lebenspartnerIstNichtDerAndereElternteilGeburtsdatum) {
			NotificationChain msgs = null;
			if (lebenspartnerIstNichtDerAndereElternteilGeburtsdatum != null)
				msgs = ((InternalEObject)lebenspartnerIstNichtDerAndereElternteilGeburtsdatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM, null, msgs);
			if (newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum != null)
				msgs = ((InternalEObject)newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM, null, msgs);
			msgs = basicSetLebenspartnerIstNichtDerAndereElternteilGeburtsdatum(newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM, newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum, newLebenspartnerIstNichtDerAndereElternteilGeburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSteuerklasse() {
		return steuerklasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSteuerklasse(BigInteger newSteuerklasse) {
		BigInteger oldSteuerklasse = steuerklasse;
		steuerklasse = newSteuerklasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE, oldSteuerklasse, steuerklasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSteuerklasseNachweis() {
		if (steuerklasseNachweis == null) {
			steuerklasseNachweis = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS);
		}
		return steuerklasseNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getSeitWann() {
		return seitWann;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeitWann(XMLGregorianCalendar newSeitWann) {
		XMLGregorianCalendar oldSeitWann = seitWann;
		seitWann = newSeitWann;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN, oldSeitWann, seitWann));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				return basicSetGetrenntLebend(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				return basicSetLebenspartnerSeitSechsMonatenInAnstalt(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME:
				return basicSetLebenspartnerIstNichtDerAndereElternteilName(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				return basicSetLebenspartnerIstNichtDerAndereElternteilAnschrift(null, msgs);
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				return basicSetLebenspartnerIstNichtDerAndereElternteilGeburtsdatum(null, msgs);
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
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				return getGetrenntLebend();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				return getGetrenntLebendGrund();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				return getLebenspartnerSeitSechsMonatenInAnstalt();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME:
				return getLebenspartnerIstNichtDerAndereElternteilName();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				return getLebenspartnerIstNichtDerAndereElternteilAnschrift();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				return getLebenspartnerIstNichtDerAndereElternteilGeburtsdatum();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE:
				return getSteuerklasse();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS:
				return getSteuerklasseNachweis();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
				return getSeitWann();
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
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				setGetrenntLebend((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				setGetrenntLebendGrund((String)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				setLebenspartnerSeitSechsMonatenInAnstalt((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME:
				setLebenspartnerIstNichtDerAndereElternteilName((NameNatuerlichePersonType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				setLebenspartnerIstNichtDerAndereElternteilAnschrift((AnschriftOptionalType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				setLebenspartnerIstNichtDerAndereElternteilGeburtsdatum((TeilbekanntesDatumType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE:
				setSteuerklasse((BigInteger)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS:
				getSteuerklasseNachweis().clear();
				getSteuerklasseNachweis().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
				setSeitWann((XMLGregorianCalendar)newValue);
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
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				setGetrenntLebend((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				setGetrenntLebendGrund(GETRENNT_LEBEND_GRUND_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				setLebenspartnerSeitSechsMonatenInAnstalt((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME:
				setLebenspartnerIstNichtDerAndereElternteilName((NameNatuerlichePersonType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				setLebenspartnerIstNichtDerAndereElternteilAnschrift((AnschriftOptionalType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				setLebenspartnerIstNichtDerAndereElternteilGeburtsdatum((TeilbekanntesDatumType)null);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE:
				setSteuerklasse(STEUERKLASSE_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS:
				getSteuerklasseNachweis().clear();
				return;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
				setSeitWann(SEIT_WANN_EDEFAULT);
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
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				return getrenntLebend != null;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				return GETRENNT_LEBEND_GRUND_EDEFAULT == null ? getrenntLebendGrund != null : !GETRENNT_LEBEND_GRUND_EDEFAULT.equals(getrenntLebendGrund);
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				return lebenspartnerSeitSechsMonatenInAnstalt != null;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_NAME:
				return lebenspartnerIstNichtDerAndereElternteilName != null;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				return lebenspartnerIstNichtDerAndereElternteilAnschrift != null;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__LEBENSPARTNER_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				return lebenspartnerIstNichtDerAndereElternteilGeburtsdatum != null;
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE:
				return STEUERKLASSE_EDEFAULT == null ? steuerklasse != null : !STEUERKLASSE_EDEFAULT.equals(steuerklasse);
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS:
				return steuerklasseNachweis != null && !steuerklasseNachweis.isEmpty();
			case UnterhaltsvorschussPackage.LEBENSPARTNERSCHAFT_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
				return SEIT_WANN_EDEFAULT == null ? seitWann != null : !SEIT_WANN_EDEFAULT.equals(seitWann);
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
		result.append(" (getrenntLebendGrund: ");
		result.append(getrenntLebendGrund);
		result.append(", steuerklasse: ");
		result.append(steuerklasse);
		result.append(", steuerklasseNachweis: ");
		result.append(steuerklasseNachweis);
		result.append(", seitWann: ");
		result.append(seitWann);
		result.append(')');
		return result.toString();
	}

} //LebenspartnerschaftAntragstellendeBasisTypeImpl
