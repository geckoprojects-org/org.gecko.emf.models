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

import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ledig Antragstellende Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl#getAndererElternteilVerstorben <em>Anderer Elternteil Verstorben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl#isLebtMitAnderemElternteilZusammen <em>Lebt Mit Anderem Elternteil Zusammen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl#isNieMitAnderemElternteilZusammengelebt <em>Nie Mit Anderem Elternteil Zusammengelebt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl#isVaterIstNamentlichBekannt <em>Vater Ist Namentlich Bekannt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl#getVomAnderenElternteilGetrennt <em>Vom Anderen Elternteil Getrennt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl#getSeitWannGetrennt <em>Seit Wann Getrennt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl#isHochzeitGeplant <em>Hochzeit Geplant</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LedigAntragstellendeBasisTypeImpl#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LedigAntragstellendeBasisTypeImpl extends MinimalEObjectImpl.Container implements LedigAntragstellendeBasisType {
	/**
	 * The cached value of the '{@link #getAndererElternteilVerstorben() <em>Anderer Elternteil Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndererElternteilVerstorben()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType andererElternteilVerstorben;

	/**
	 * The default value of the '{@link #isLebtMitAnderemElternteilZusammen() <em>Lebt Mit Anderem Elternteil Zusammen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLebtMitAnderemElternteilZusammen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLebtMitAnderemElternteilZusammen() <em>Lebt Mit Anderem Elternteil Zusammen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLebtMitAnderemElternteilZusammen()
	 * @generated
	 * @ordered
	 */
	protected boolean lebtMitAnderemElternteilZusammen = LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN_EDEFAULT;

	/**
	 * This is true if the Lebt Mit Anderem Elternteil Zusammen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lebtMitAnderemElternteilZusammenESet;

	/**
	 * The default value of the '{@link #isNieMitAnderemElternteilZusammengelebt() <em>Nie Mit Anderem Elternteil Zusammengelebt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNieMitAnderemElternteilZusammengelebt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNieMitAnderemElternteilZusammengelebt() <em>Nie Mit Anderem Elternteil Zusammengelebt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNieMitAnderemElternteilZusammengelebt()
	 * @generated
	 * @ordered
	 */
	protected boolean nieMitAnderemElternteilZusammengelebt = NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT_EDEFAULT;

	/**
	 * This is true if the Nie Mit Anderem Elternteil Zusammengelebt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nieMitAnderemElternteilZusammengelebtESet;

	/**
	 * The default value of the '{@link #isVaterIstNamentlichBekannt() <em>Vater Ist Namentlich Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVaterIstNamentlichBekannt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VATER_IST_NAMENTLICH_BEKANNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVaterIstNamentlichBekannt() <em>Vater Ist Namentlich Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVaterIstNamentlichBekannt()
	 * @generated
	 * @ordered
	 */
	protected boolean vaterIstNamentlichBekannt = VATER_IST_NAMENTLICH_BEKANNT_EDEFAULT;

	/**
	 * This is true if the Vater Ist Namentlich Bekannt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vaterIstNamentlichBekanntESet;

	/**
	 * The cached value of the '{@link #getVomAnderenElternteilGetrennt() <em>Vom Anderen Elternteil Getrennt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVomAnderenElternteilGetrennt()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType vomAnderenElternteilGetrennt;

	/**
	 * The cached value of the '{@link #getSeitWannGetrennt() <em>Seit Wann Getrennt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeitWannGetrennt()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType seitWannGetrennt;

	/**
	 * The default value of the '{@link #isHochzeitGeplant() <em>Hochzeit Geplant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHochzeitGeplant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOCHZEIT_GEPLANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHochzeitGeplant() <em>Hochzeit Geplant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHochzeitGeplant()
	 * @generated
	 * @ordered
	 */
	protected boolean hochzeitGeplant = HOCHZEIT_GEPLANT_EDEFAULT;

	/**
	 * This is true if the Hochzeit Geplant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hochzeitGeplantESet;

	/**
	 * The default value of the '{@link #getHochzeitsdatumVoraussichtlich() <em>Hochzeitsdatum Voraussichtlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHochzeitsdatumVoraussichtlich()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHochzeitsdatumVoraussichtlich() <em>Hochzeitsdatum Voraussichtlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHochzeitsdatumVoraussichtlich()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar hochzeitsdatumVoraussichtlich = HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LedigAntragstellendeBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getLedigAntragstellendeBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getAndererElternteilVerstorben() {
		return andererElternteilVerstorben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAndererElternteilVerstorben(TatsacheMitNachweisType newAndererElternteilVerstorben, NotificationChain msgs) {
		TatsacheMitNachweisType oldAndererElternteilVerstorben = andererElternteilVerstorben;
		andererElternteilVerstorben = newAndererElternteilVerstorben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN, oldAndererElternteilVerstorben, newAndererElternteilVerstorben);
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
	public void setAndererElternteilVerstorben(TatsacheMitNachweisType newAndererElternteilVerstorben) {
		if (newAndererElternteilVerstorben != andererElternteilVerstorben) {
			NotificationChain msgs = null;
			if (andererElternteilVerstorben != null)
				msgs = ((InternalEObject)andererElternteilVerstorben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN, null, msgs);
			if (newAndererElternteilVerstorben != null)
				msgs = ((InternalEObject)newAndererElternteilVerstorben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN, null, msgs);
			msgs = basicSetAndererElternteilVerstorben(newAndererElternteilVerstorben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN, newAndererElternteilVerstorben, newAndererElternteilVerstorben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLebtMitAnderemElternteilZusammen() {
		return lebtMitAnderemElternteilZusammen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLebtMitAnderemElternteilZusammen(boolean newLebtMitAnderemElternteilZusammen) {
		boolean oldLebtMitAnderemElternteilZusammen = lebtMitAnderemElternteilZusammen;
		lebtMitAnderemElternteilZusammen = newLebtMitAnderemElternteilZusammen;
		boolean oldLebtMitAnderemElternteilZusammenESet = lebtMitAnderemElternteilZusammenESet;
		lebtMitAnderemElternteilZusammenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN, oldLebtMitAnderemElternteilZusammen, lebtMitAnderemElternteilZusammen, !oldLebtMitAnderemElternteilZusammenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLebtMitAnderemElternteilZusammen() {
		boolean oldLebtMitAnderemElternteilZusammen = lebtMitAnderemElternteilZusammen;
		boolean oldLebtMitAnderemElternteilZusammenESet = lebtMitAnderemElternteilZusammenESet;
		lebtMitAnderemElternteilZusammen = LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN_EDEFAULT;
		lebtMitAnderemElternteilZusammenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN, oldLebtMitAnderemElternteilZusammen, LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN_EDEFAULT, oldLebtMitAnderemElternteilZusammenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLebtMitAnderemElternteilZusammen() {
		return lebtMitAnderemElternteilZusammenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNieMitAnderemElternteilZusammengelebt() {
		return nieMitAnderemElternteilZusammengelebt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNieMitAnderemElternteilZusammengelebt(boolean newNieMitAnderemElternteilZusammengelebt) {
		boolean oldNieMitAnderemElternteilZusammengelebt = nieMitAnderemElternteilZusammengelebt;
		nieMitAnderemElternteilZusammengelebt = newNieMitAnderemElternteilZusammengelebt;
		boolean oldNieMitAnderemElternteilZusammengelebtESet = nieMitAnderemElternteilZusammengelebtESet;
		nieMitAnderemElternteilZusammengelebtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT, oldNieMitAnderemElternteilZusammengelebt, nieMitAnderemElternteilZusammengelebt, !oldNieMitAnderemElternteilZusammengelebtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNieMitAnderemElternteilZusammengelebt() {
		boolean oldNieMitAnderemElternteilZusammengelebt = nieMitAnderemElternteilZusammengelebt;
		boolean oldNieMitAnderemElternteilZusammengelebtESet = nieMitAnderemElternteilZusammengelebtESet;
		nieMitAnderemElternteilZusammengelebt = NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT_EDEFAULT;
		nieMitAnderemElternteilZusammengelebtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT, oldNieMitAnderemElternteilZusammengelebt, NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT_EDEFAULT, oldNieMitAnderemElternteilZusammengelebtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNieMitAnderemElternteilZusammengelebt() {
		return nieMitAnderemElternteilZusammengelebtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVaterIstNamentlichBekannt() {
		return vaterIstNamentlichBekannt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVaterIstNamentlichBekannt(boolean newVaterIstNamentlichBekannt) {
		boolean oldVaterIstNamentlichBekannt = vaterIstNamentlichBekannt;
		vaterIstNamentlichBekannt = newVaterIstNamentlichBekannt;
		boolean oldVaterIstNamentlichBekanntESet = vaterIstNamentlichBekanntESet;
		vaterIstNamentlichBekanntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VATER_IST_NAMENTLICH_BEKANNT, oldVaterIstNamentlichBekannt, vaterIstNamentlichBekannt, !oldVaterIstNamentlichBekanntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVaterIstNamentlichBekannt() {
		boolean oldVaterIstNamentlichBekannt = vaterIstNamentlichBekannt;
		boolean oldVaterIstNamentlichBekanntESet = vaterIstNamentlichBekanntESet;
		vaterIstNamentlichBekannt = VATER_IST_NAMENTLICH_BEKANNT_EDEFAULT;
		vaterIstNamentlichBekanntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VATER_IST_NAMENTLICH_BEKANNT, oldVaterIstNamentlichBekannt, VATER_IST_NAMENTLICH_BEKANNT_EDEFAULT, oldVaterIstNamentlichBekanntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVaterIstNamentlichBekannt() {
		return vaterIstNamentlichBekanntESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getVomAnderenElternteilGetrennt() {
		return vomAnderenElternteilGetrennt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVomAnderenElternteilGetrennt(TatsacheMitNachweisType newVomAnderenElternteilGetrennt, NotificationChain msgs) {
		TatsacheMitNachweisType oldVomAnderenElternteilGetrennt = vomAnderenElternteilGetrennt;
		vomAnderenElternteilGetrennt = newVomAnderenElternteilGetrennt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT, oldVomAnderenElternteilGetrennt, newVomAnderenElternteilGetrennt);
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
	public void setVomAnderenElternteilGetrennt(TatsacheMitNachweisType newVomAnderenElternteilGetrennt) {
		if (newVomAnderenElternteilGetrennt != vomAnderenElternteilGetrennt) {
			NotificationChain msgs = null;
			if (vomAnderenElternteilGetrennt != null)
				msgs = ((InternalEObject)vomAnderenElternteilGetrennt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT, null, msgs);
			if (newVomAnderenElternteilGetrennt != null)
				msgs = ((InternalEObject)newVomAnderenElternteilGetrennt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT, null, msgs);
			msgs = basicSetVomAnderenElternteilGetrennt(newVomAnderenElternteilGetrennt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT, newVomAnderenElternteilGetrennt, newVomAnderenElternteilGetrennt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getSeitWannGetrennt() {
		return seitWannGetrennt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeitWannGetrennt(TeilbekanntesDatumType newSeitWannGetrennt, NotificationChain msgs) {
		TeilbekanntesDatumType oldSeitWannGetrennt = seitWannGetrennt;
		seitWannGetrennt = newSeitWannGetrennt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT, oldSeitWannGetrennt, newSeitWannGetrennt);
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
	public void setSeitWannGetrennt(TeilbekanntesDatumType newSeitWannGetrennt) {
		if (newSeitWannGetrennt != seitWannGetrennt) {
			NotificationChain msgs = null;
			if (seitWannGetrennt != null)
				msgs = ((InternalEObject)seitWannGetrennt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT, null, msgs);
			if (newSeitWannGetrennt != null)
				msgs = ((InternalEObject)newSeitWannGetrennt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT, null, msgs);
			msgs = basicSetSeitWannGetrennt(newSeitWannGetrennt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT, newSeitWannGetrennt, newSeitWannGetrennt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHochzeitGeplant() {
		return hochzeitGeplant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHochzeitGeplant(boolean newHochzeitGeplant) {
		boolean oldHochzeitGeplant = hochzeitGeplant;
		hochzeitGeplant = newHochzeitGeplant;
		boolean oldHochzeitGeplantESet = hochzeitGeplantESet;
		hochzeitGeplantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT, oldHochzeitGeplant, hochzeitGeplant, !oldHochzeitGeplantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHochzeitGeplant() {
		boolean oldHochzeitGeplant = hochzeitGeplant;
		boolean oldHochzeitGeplantESet = hochzeitGeplantESet;
		hochzeitGeplant = HOCHZEIT_GEPLANT_EDEFAULT;
		hochzeitGeplantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT, oldHochzeitGeplant, HOCHZEIT_GEPLANT_EDEFAULT, oldHochzeitGeplantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHochzeitGeplant() {
		return hochzeitGeplantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getHochzeitsdatumVoraussichtlich() {
		return hochzeitsdatumVoraussichtlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHochzeitsdatumVoraussichtlich(XMLGregorianCalendar newHochzeitsdatumVoraussichtlich) {
		XMLGregorianCalendar oldHochzeitsdatumVoraussichtlich = hochzeitsdatumVoraussichtlich;
		hochzeitsdatumVoraussichtlich = newHochzeitsdatumVoraussichtlich;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH, oldHochzeitsdatumVoraussichtlich, hochzeitsdatumVoraussichtlich));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND, oldGetrenntLebendGrund, getrenntLebendGrund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN:
				return basicSetAndererElternteilVerstorben(null, msgs);
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT:
				return basicSetVomAnderenElternteilGetrennt(null, msgs);
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT:
				return basicSetSeitWannGetrennt(null, msgs);
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
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN:
				return getAndererElternteilVerstorben();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN:
				return isLebtMitAnderemElternteilZusammen();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT:
				return isNieMitAnderemElternteilZusammengelebt();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VATER_IST_NAMENTLICH_BEKANNT:
				return isVaterIstNamentlichBekannt();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT:
				return getVomAnderenElternteilGetrennt();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT:
				return getSeitWannGetrennt();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT:
				return isHochzeitGeplant();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH:
				return getHochzeitsdatumVoraussichtlich();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				return getGetrenntLebendGrund();
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
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN:
				setAndererElternteilVerstorben((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN:
				setLebtMitAnderemElternteilZusammen((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT:
				setNieMitAnderemElternteilZusammengelebt((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VATER_IST_NAMENTLICH_BEKANNT:
				setVaterIstNamentlichBekannt((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT:
				setVomAnderenElternteilGetrennt((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT:
				setSeitWannGetrennt((TeilbekanntesDatumType)newValue);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT:
				setHochzeitGeplant((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH:
				setHochzeitsdatumVoraussichtlich((XMLGregorianCalendar)newValue);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				setGetrenntLebendGrund((String)newValue);
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
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN:
				setAndererElternteilVerstorben((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN:
				unsetLebtMitAnderemElternteilZusammen();
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT:
				unsetNieMitAnderemElternteilZusammengelebt();
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VATER_IST_NAMENTLICH_BEKANNT:
				unsetVaterIstNamentlichBekannt();
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT:
				setVomAnderenElternteilGetrennt((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT:
				setSeitWannGetrennt((TeilbekanntesDatumType)null);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT:
				unsetHochzeitGeplant();
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH:
				setHochzeitsdatumVoraussichtlich(HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				setGetrenntLebendGrund(GETRENNT_LEBEND_GRUND_EDEFAULT);
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
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__ANDERER_ELTERNTEIL_VERSTORBEN:
				return andererElternteilVerstorben != null;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__LEBT_MIT_ANDEREM_ELTERNTEIL_ZUSAMMEN:
				return isSetLebtMitAnderemElternteilZusammen();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__NIE_MIT_ANDEREM_ELTERNTEIL_ZUSAMMENGELEBT:
				return isSetNieMitAnderemElternteilZusammengelebt();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VATER_IST_NAMENTLICH_BEKANNT:
				return isSetVaterIstNamentlichBekannt();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__VOM_ANDEREN_ELTERNTEIL_GETRENNT:
				return vomAnderenElternteilGetrennt != null;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__SEIT_WANN_GETRENNT:
				return seitWannGetrennt != null;
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEIT_GEPLANT:
				return isSetHochzeitGeplant();
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__HOCHZEITSDATUM_VORAUSSICHTLICH:
				return HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT == null ? hochzeitsdatumVoraussichtlich != null : !HOCHZEITSDATUM_VORAUSSICHTLICH_EDEFAULT.equals(hochzeitsdatumVoraussichtlich);
			case UnterhaltsvorschussPackage.LEDIG_ANTRAGSTELLENDE_BASIS_TYPE__GETRENNT_LEBEND_GRUND:
				return GETRENNT_LEBEND_GRUND_EDEFAULT == null ? getrenntLebendGrund != null : !GETRENNT_LEBEND_GRUND_EDEFAULT.equals(getrenntLebendGrund);
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
		result.append(" (lebtMitAnderemElternteilZusammen: ");
		if (lebtMitAnderemElternteilZusammenESet) result.append(lebtMitAnderemElternteilZusammen); else result.append("<unset>");
		result.append(", nieMitAnderemElternteilZusammengelebt: ");
		if (nieMitAnderemElternteilZusammengelebtESet) result.append(nieMitAnderemElternteilZusammengelebt); else result.append("<unset>");
		result.append(", vaterIstNamentlichBekannt: ");
		if (vaterIstNamentlichBekanntESet) result.append(vaterIstNamentlichBekannt); else result.append("<unset>");
		result.append(", hochzeitGeplant: ");
		if (hochzeitGeplantESet) result.append(hochzeitGeplant); else result.append("<unset>");
		result.append(", hochzeitsdatumVoraussichtlich: ");
		result.append(hochzeitsdatumVoraussichtlich);
		result.append(", getrenntLebendGrund: ");
		result.append(getrenntLebendGrund);
		result.append(')');
		return result.toString();
	}

} //LedigAntragstellendeBasisTypeImpl
