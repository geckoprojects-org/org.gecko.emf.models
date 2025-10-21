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
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VerheiratetAntragstellendeBasisType;

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
 * An implementation of the model object '<em><b>Verheiratet Antragstellende Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl#getGetrenntLebend <em>Getrennt Lebend</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl#getEhepartnerSeitSechsMonatenInAnstalt <em>Ehepartner Seit Sechs Monaten In Anstalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl#getEhegatteIstNichtDerAndereElternteillName <em>Ehegatte Ist Nicht Der Andere Elternteill Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl#getEhegatteIstNichtDerAndereElternteilAnschrift <em>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl#getEhegatteIstNichtDerAndereElternteilGeburtsdatum <em>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl#getSteuerklasse <em>Steuerklasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl#getSteuerklasseNachweis <em>Steuerklasse Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VerheiratetAntragstellendeBasisTypeImpl#getSeitWann <em>Seit Wann</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerheiratetAntragstellendeBasisTypeImpl extends MinimalEObjectImpl.Container implements VerheiratetAntragstellendeBasisType {
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
	 * The cached value of the '{@link #getEhepartnerSeitSechsMonatenInAnstalt() <em>Ehepartner Seit Sechs Monaten In Anstalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEhepartnerSeitSechsMonatenInAnstalt()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType ehepartnerSeitSechsMonatenInAnstalt;

	/**
	 * The cached value of the '{@link #getEhegatteIstNichtDerAndereElternteillName() <em>Ehegatte Ist Nicht Der Andere Elternteill Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEhegatteIstNichtDerAndereElternteillName()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType ehegatteIstNichtDerAndereElternteillName;

	/**
	 * The cached value of the '{@link #getEhegatteIstNichtDerAndereElternteilAnschrift() <em>Ehegatte Ist Nicht Der Andere Elternteil Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEhegatteIstNichtDerAndereElternteilAnschrift()
	 * @generated
	 * @ordered
	 */
	protected AnschriftOptionalType ehegatteIstNichtDerAndereElternteilAnschrift;

	/**
	 * The cached value of the '{@link #getEhegatteIstNichtDerAndereElternteilGeburtsdatum() <em>Ehegatte Ist Nicht Der Andere Elternteil Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEhegatteIstNichtDerAndereElternteilGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType ehegatteIstNichtDerAndereElternteilGeburtsdatum;

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
	protected VerheiratetAntragstellendeBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getVerheiratetAntragstellendeBasisType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND, oldGetrenntLebend, newGetrenntLebend);
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
				msgs = ((InternalEObject)getrenntLebend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND, null, msgs);
			if (newGetrenntLebend != null)
				msgs = ((InternalEObject)newGetrenntLebend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND, null, msgs);
			msgs = basicSetGetrenntLebend(newGetrenntLebend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND, newGetrenntLebend, newGetrenntLebend));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND, oldGetrenntLebendGrund, getrenntLebendGrund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getEhepartnerSeitSechsMonatenInAnstalt() {
		return ehepartnerSeitSechsMonatenInAnstalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEhepartnerSeitSechsMonatenInAnstalt(TatsacheMitNachweisType newEhepartnerSeitSechsMonatenInAnstalt, NotificationChain msgs) {
		TatsacheMitNachweisType oldEhepartnerSeitSechsMonatenInAnstalt = ehepartnerSeitSechsMonatenInAnstalt;
		ehepartnerSeitSechsMonatenInAnstalt = newEhepartnerSeitSechsMonatenInAnstalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT, oldEhepartnerSeitSechsMonatenInAnstalt, newEhepartnerSeitSechsMonatenInAnstalt);
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
	public void setEhepartnerSeitSechsMonatenInAnstalt(TatsacheMitNachweisType newEhepartnerSeitSechsMonatenInAnstalt) {
		if (newEhepartnerSeitSechsMonatenInAnstalt != ehepartnerSeitSechsMonatenInAnstalt) {
			NotificationChain msgs = null;
			if (ehepartnerSeitSechsMonatenInAnstalt != null)
				msgs = ((InternalEObject)ehepartnerSeitSechsMonatenInAnstalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT, null, msgs);
			if (newEhepartnerSeitSechsMonatenInAnstalt != null)
				msgs = ((InternalEObject)newEhepartnerSeitSechsMonatenInAnstalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT, null, msgs);
			msgs = basicSetEhepartnerSeitSechsMonatenInAnstalt(newEhepartnerSeitSechsMonatenInAnstalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT, newEhepartnerSeitSechsMonatenInAnstalt, newEhepartnerSeitSechsMonatenInAnstalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getEhegatteIstNichtDerAndereElternteillName() {
		return ehegatteIstNichtDerAndereElternteillName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEhegatteIstNichtDerAndereElternteillName(NameNatuerlichePersonType newEhegatteIstNichtDerAndereElternteillName, NotificationChain msgs) {
		NameNatuerlichePersonType oldEhegatteIstNichtDerAndereElternteillName = ehegatteIstNichtDerAndereElternteillName;
		ehegatteIstNichtDerAndereElternteillName = newEhegatteIstNichtDerAndereElternteillName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME, oldEhegatteIstNichtDerAndereElternteillName, newEhegatteIstNichtDerAndereElternteillName);
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
	public void setEhegatteIstNichtDerAndereElternteillName(NameNatuerlichePersonType newEhegatteIstNichtDerAndereElternteillName) {
		if (newEhegatteIstNichtDerAndereElternteillName != ehegatteIstNichtDerAndereElternteillName) {
			NotificationChain msgs = null;
			if (ehegatteIstNichtDerAndereElternteillName != null)
				msgs = ((InternalEObject)ehegatteIstNichtDerAndereElternteillName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME, null, msgs);
			if (newEhegatteIstNichtDerAndereElternteillName != null)
				msgs = ((InternalEObject)newEhegatteIstNichtDerAndereElternteillName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME, null, msgs);
			msgs = basicSetEhegatteIstNichtDerAndereElternteillName(newEhegatteIstNichtDerAndereElternteillName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME, newEhegatteIstNichtDerAndereElternteillName, newEhegatteIstNichtDerAndereElternteillName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftOptionalType getEhegatteIstNichtDerAndereElternteilAnschrift() {
		return ehegatteIstNichtDerAndereElternteilAnschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEhegatteIstNichtDerAndereElternteilAnschrift(AnschriftOptionalType newEhegatteIstNichtDerAndereElternteilAnschrift, NotificationChain msgs) {
		AnschriftOptionalType oldEhegatteIstNichtDerAndereElternteilAnschrift = ehegatteIstNichtDerAndereElternteilAnschrift;
		ehegatteIstNichtDerAndereElternteilAnschrift = newEhegatteIstNichtDerAndereElternteilAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT, oldEhegatteIstNichtDerAndereElternteilAnschrift, newEhegatteIstNichtDerAndereElternteilAnschrift);
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
	public void setEhegatteIstNichtDerAndereElternteilAnschrift(AnschriftOptionalType newEhegatteIstNichtDerAndereElternteilAnschrift) {
		if (newEhegatteIstNichtDerAndereElternteilAnschrift != ehegatteIstNichtDerAndereElternteilAnschrift) {
			NotificationChain msgs = null;
			if (ehegatteIstNichtDerAndereElternteilAnschrift != null)
				msgs = ((InternalEObject)ehegatteIstNichtDerAndereElternteilAnschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT, null, msgs);
			if (newEhegatteIstNichtDerAndereElternteilAnschrift != null)
				msgs = ((InternalEObject)newEhegatteIstNichtDerAndereElternteilAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT, null, msgs);
			msgs = basicSetEhegatteIstNichtDerAndereElternteilAnschrift(newEhegatteIstNichtDerAndereElternteilAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT, newEhegatteIstNichtDerAndereElternteilAnschrift, newEhegatteIstNichtDerAndereElternteilAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getEhegatteIstNichtDerAndereElternteilGeburtsdatum() {
		return ehegatteIstNichtDerAndereElternteilGeburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEhegatteIstNichtDerAndereElternteilGeburtsdatum(TeilbekanntesDatumType newEhegatteIstNichtDerAndereElternteilGeburtsdatum, NotificationChain msgs) {
		TeilbekanntesDatumType oldEhegatteIstNichtDerAndereElternteilGeburtsdatum = ehegatteIstNichtDerAndereElternteilGeburtsdatum;
		ehegatteIstNichtDerAndereElternteilGeburtsdatum = newEhegatteIstNichtDerAndereElternteilGeburtsdatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM, oldEhegatteIstNichtDerAndereElternteilGeburtsdatum, newEhegatteIstNichtDerAndereElternteilGeburtsdatum);
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
	public void setEhegatteIstNichtDerAndereElternteilGeburtsdatum(TeilbekanntesDatumType newEhegatteIstNichtDerAndereElternteilGeburtsdatum) {
		if (newEhegatteIstNichtDerAndereElternteilGeburtsdatum != ehegatteIstNichtDerAndereElternteilGeburtsdatum) {
			NotificationChain msgs = null;
			if (ehegatteIstNichtDerAndereElternteilGeburtsdatum != null)
				msgs = ((InternalEObject)ehegatteIstNichtDerAndereElternteilGeburtsdatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM, null, msgs);
			if (newEhegatteIstNichtDerAndereElternteilGeburtsdatum != null)
				msgs = ((InternalEObject)newEhegatteIstNichtDerAndereElternteilGeburtsdatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM, null, msgs);
			msgs = basicSetEhegatteIstNichtDerAndereElternteilGeburtsdatum(newEhegatteIstNichtDerAndereElternteilGeburtsdatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM, newEhegatteIstNichtDerAndereElternteilGeburtsdatum, newEhegatteIstNichtDerAndereElternteilGeburtsdatum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE, oldSteuerklasse, steuerklasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSteuerklasseNachweis() {
		if (steuerklasseNachweis == null) {
			steuerklasseNachweis = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN, oldSeitWann, seitWann));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				return basicSetGetrenntLebend(null, msgs);
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				return basicSetEhepartnerSeitSechsMonatenInAnstalt(null, msgs);
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME:
				return basicSetEhegatteIstNichtDerAndereElternteillName(null, msgs);
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				return basicSetEhegatteIstNichtDerAndereElternteilAnschrift(null, msgs);
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				return basicSetEhegatteIstNichtDerAndereElternteilGeburtsdatum(null, msgs);
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
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				return getGetrenntLebend();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				return getGetrenntLebendGrund();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				return getEhepartnerSeitSechsMonatenInAnstalt();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME:
				return getEhegatteIstNichtDerAndereElternteillName();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				return getEhegatteIstNichtDerAndereElternteilAnschrift();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				return getEhegatteIstNichtDerAndereElternteilGeburtsdatum();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE:
				return getSteuerklasse();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS:
				return getSteuerklasseNachweis();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
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
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				setGetrenntLebend((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				setGetrenntLebendGrund((String)newValue);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				setEhepartnerSeitSechsMonatenInAnstalt((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME:
				setEhegatteIstNichtDerAndereElternteillName((NameNatuerlichePersonType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				setEhegatteIstNichtDerAndereElternteilAnschrift((AnschriftOptionalType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				setEhegatteIstNichtDerAndereElternteilGeburtsdatum((TeilbekanntesDatumType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE:
				setSteuerklasse((BigInteger)newValue);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS:
				getSteuerklasseNachweis().clear();
				getSteuerklasseNachweis().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
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
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				setGetrenntLebend((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				setGetrenntLebendGrund(GETRENNT_LEBEND_GRUND_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				setEhepartnerSeitSechsMonatenInAnstalt((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME:
				setEhegatteIstNichtDerAndereElternteillName((NameNatuerlichePersonType)null);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				setEhegatteIstNichtDerAndereElternteilAnschrift((AnschriftOptionalType)null);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				setEhegatteIstNichtDerAndereElternteilGeburtsdatum((TeilbekanntesDatumType)null);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE:
				setSteuerklasse(STEUERKLASSE_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS:
				getSteuerklasseNachweis().clear();
				return;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
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
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND:
				return getrenntLebend != null;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				return GETRENNT_LEBEND_GRUND_EDEFAULT == null ? getrenntLebendGrund != null : !GETRENNT_LEBEND_GRUND_EDEFAULT.equals(getrenntLebendGrund);
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEPARTNER_SEIT_SECHS_MONATEN_IN_ANSTALT:
				return ehepartnerSeitSechsMonatenInAnstalt != null;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEILL_NAME:
				return ehegatteIstNichtDerAndereElternteillName != null;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_ANSCHRIFT:
				return ehegatteIstNichtDerAndereElternteilAnschrift != null;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__EHEGATTE_IST_NICHT_DER_ANDERE_ELTERNTEIL_GEBURTSDATUM:
				return ehegatteIstNichtDerAndereElternteilGeburtsdatum != null;
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE:
				return STEUERKLASSE_EDEFAULT == null ? steuerklasse != null : !STEUERKLASSE_EDEFAULT.equals(steuerklasse);
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__STEUERKLASSE_NACHWEIS:
				return steuerklasseNachweis != null && !steuerklasseNachweis.isEmpty();
			case UnterhaltsvorschussPackage.VERHEIRATET_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN:
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

} //VerheiratetAntragstellendeBasisTypeImpl
