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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.StaatsangehoerigkeitAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.TraegerKrankenversicherungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType;

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
 * An implementation of the model object '<em><b>Anderer Elternteil Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getAnrede <em>Anrede</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getKindschaftsbeziehung <em>Kindschaftsbeziehung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getAndereRegelmaessigerAufenthaltort <em>Andere Regelmaessiger Aufenthaltort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getZusammenlebendMitNeuenPartner <em>Zusammenlebend Mit Neuen Partner</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getVertretung <em>Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getVermoegen <em>Vermoegen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getEinkuenfte <em>Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getSonstigeLeistungen <em>Sonstige Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getTraegerKrankenversicherung <em>Traeger Krankenversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getWeitereKinder <em>Weitere Kinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getAusbildung <em>Ausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getLeistungsfaehig <em>Leistungsfaehig</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getWeitereAngaben <em>Weitere Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AndererElternteilBasisTypeImpl#getGeschlecht <em>Geschlecht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndererElternteilBasisTypeImpl extends MinimalEObjectImpl.Container implements AndererElternteilBasisType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameOptionalType name;

	/**
	 * The cached value of the '{@link #getGeburt() <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburt()
	 * @generated
	 * @ordered
	 */
	protected GeburtType geburt;

	/**
	 * The default value of the '{@link #getAnrede() <em>Anrede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnrede()
	 * @generated
	 * @ordered
	 */
	protected static final String ANREDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnrede() <em>Anrede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnrede()
	 * @generated
	 * @ordered
	 */
	protected String anrede = ANREDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKindschaftsbeziehung() <em>Kindschaftsbeziehung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindschaftsbeziehung()
	 * @generated
	 * @ordered
	 */
	protected CodeKindschaftsbeziehungType kindschaftsbeziehung;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected AnschriftOptionalType anschrift;

	/**
	 * The cached value of the '{@link #getAndereRegelmaessigerAufenthaltort() <em>Andere Regelmaessiger Aufenthaltort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndereRegelmaessigerAufenthaltort()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitFreitextType andereRegelmaessigerAufenthaltort;

	/**
	 * The cached value of the '{@link #getStaatsangehoerigkeit() <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected StaatsangehoerigkeitAndererElternteilType staatsangehoerigkeit;

	/**
	 * The cached value of the '{@link #getZusammenlebendMitNeuenPartner() <em>Zusammenlebend Mit Neuen Partner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusammenlebendMitNeuenPartner()
	 * @generated
	 * @ordered
	 */
	protected CodeTatsachenbehauptungType zusammenlebendMitNeuenPartner;

	/**
	 * The cached value of the '{@link #getErreichbarkeit() <em>Erreichbarkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErreichbarkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<ErreichbarkeitType> erreichbarkeit;

	/**
	 * The cached value of the '{@link #getVertretung() <em>Vertretung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertretung()
	 * @generated
	 * @ordered
	 */
	protected EList<VertretungType> vertretung;

	/**
	 * The cached value of the '{@link #getVermoegen() <em>Vermoegen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVermoegen()
	 * @generated
	 * @ordered
	 */
	protected EList<VermoegenAndererElternteilType> vermoegen;

	/**
	 * The cached value of the '{@link #getEinkuenfte() <em>Einkuenfte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected EList<EinkuenfteAndererElternteilType> einkuenfte;

	/**
	 * The cached value of the '{@link #getSonstigeLeistungen() <em>Sonstige Leistungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigeLeistungen()
	 * @generated
	 * @ordered
	 */
	protected EList<SonstigeLeistungAndererElternteilType> sonstigeLeistungen;

	/**
	 * The cached value of the '{@link #getTraegerKrankenversicherung() <em>Traeger Krankenversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraegerKrankenversicherung()
	 * @generated
	 * @ordered
	 */
	protected TraegerKrankenversicherungType traegerKrankenversicherung;

	/**
	 * The cached value of the '{@link #getWeitereKinder() <em>Weitere Kinder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereKinder()
	 * @generated
	 * @ordered
	 */
	protected EList<WeitereKinderAndererElternteilType> weitereKinder;

	/**
	 * The cached value of the '{@link #getAusbildung() <em>Ausbildung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusbildung()
	 * @generated
	 * @ordered
	 */
	protected EList<AusbildungAndererElternteilType> ausbildung;

	/**
	 * The default value of the '{@link #getLeistungsfaehig() <em>Leistungsfaehig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeistungsfaehig()
	 * @generated
	 * @ordered
	 */
	protected static final String LEISTUNGSFAEHIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeistungsfaehig() <em>Leistungsfaehig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeistungsfaehig()
	 * @generated
	 * @ordered
	 */
	protected String leistungsfaehig = LEISTUNGSFAEHIG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWeitereAngaben() <em>Weitere Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereAngaben()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitFreitextType weitereAngaben;

	/**
	 * The cached value of the '{@link #getGeschlecht() <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschlecht()
	 * @generated
	 * @ordered
	 */
	protected CodeGeschlechtType geschlecht;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndererElternteilBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getAndererElternteilBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameOptionalType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameOptionalType newName, NotificationChain msgs) {
		NameOptionalType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__NAME, oldName, newName);
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
	public void setName(NameOptionalType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(GeburtType newGeburt, NotificationChain msgs) {
		GeburtType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT, oldGeburt, newGeburt);
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
	public void setGeburt(GeburtType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnrede() {
		return anrede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnrede(String newAnrede) {
		String oldAnrede = anrede;
		anrede = newAnrede;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANREDE, oldAnrede, anrede));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindschaftsbeziehungType getKindschaftsbeziehung() {
		return kindschaftsbeziehung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKindschaftsbeziehung(CodeKindschaftsbeziehungType newKindschaftsbeziehung, NotificationChain msgs) {
		CodeKindschaftsbeziehungType oldKindschaftsbeziehung = kindschaftsbeziehung;
		kindschaftsbeziehung = newKindschaftsbeziehung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG, oldKindschaftsbeziehung, newKindschaftsbeziehung);
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
	public void setKindschaftsbeziehung(CodeKindschaftsbeziehungType newKindschaftsbeziehung) {
		if (newKindschaftsbeziehung != kindschaftsbeziehung) {
			NotificationChain msgs = null;
			if (kindschaftsbeziehung != null)
				msgs = ((InternalEObject)kindschaftsbeziehung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG, null, msgs);
			if (newKindschaftsbeziehung != null)
				msgs = ((InternalEObject)newKindschaftsbeziehung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG, null, msgs);
			msgs = basicSetKindschaftsbeziehung(newKindschaftsbeziehung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG, newKindschaftsbeziehung, newKindschaftsbeziehung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnschriftOptionalType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(AnschriftOptionalType newAnschrift, NotificationChain msgs) {
		AnschriftOptionalType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
	public void setAnschrift(AnschriftOptionalType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitFreitextType getAndereRegelmaessigerAufenthaltort() {
		return andereRegelmaessigerAufenthaltort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAndereRegelmaessigerAufenthaltort(TatsacheMitFreitextType newAndereRegelmaessigerAufenthaltort, NotificationChain msgs) {
		TatsacheMitFreitextType oldAndereRegelmaessigerAufenthaltort = andereRegelmaessigerAufenthaltort;
		andereRegelmaessigerAufenthaltort = newAndereRegelmaessigerAufenthaltort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT, oldAndereRegelmaessigerAufenthaltort, newAndereRegelmaessigerAufenthaltort);
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
	public void setAndereRegelmaessigerAufenthaltort(TatsacheMitFreitextType newAndereRegelmaessigerAufenthaltort) {
		if (newAndereRegelmaessigerAufenthaltort != andereRegelmaessigerAufenthaltort) {
			NotificationChain msgs = null;
			if (andereRegelmaessigerAufenthaltort != null)
				msgs = ((InternalEObject)andereRegelmaessigerAufenthaltort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT, null, msgs);
			if (newAndereRegelmaessigerAufenthaltort != null)
				msgs = ((InternalEObject)newAndereRegelmaessigerAufenthaltort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT, null, msgs);
			msgs = basicSetAndereRegelmaessigerAufenthaltort(newAndereRegelmaessigerAufenthaltort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT, newAndereRegelmaessigerAufenthaltort, newAndereRegelmaessigerAufenthaltort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatsangehoerigkeitAndererElternteilType getStaatsangehoerigkeit() {
		return staatsangehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaatsangehoerigkeit(StaatsangehoerigkeitAndererElternteilType newStaatsangehoerigkeit, NotificationChain msgs) {
		StaatsangehoerigkeitAndererElternteilType oldStaatsangehoerigkeit = staatsangehoerigkeit;
		staatsangehoerigkeit = newStaatsangehoerigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT, oldStaatsangehoerigkeit, newStaatsangehoerigkeit);
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
	public void setStaatsangehoerigkeit(StaatsangehoerigkeitAndererElternteilType newStaatsangehoerigkeit) {
		if (newStaatsangehoerigkeit != staatsangehoerigkeit) {
			NotificationChain msgs = null;
			if (staatsangehoerigkeit != null)
				msgs = ((InternalEObject)staatsangehoerigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			if (newStaatsangehoerigkeit != null)
				msgs = ((InternalEObject)newStaatsangehoerigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			msgs = basicSetStaatsangehoerigkeit(newStaatsangehoerigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT, newStaatsangehoerigkeit, newStaatsangehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeTatsachenbehauptungType getZusammenlebendMitNeuenPartner() {
		return zusammenlebendMitNeuenPartner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZusammenlebendMitNeuenPartner(CodeTatsachenbehauptungType newZusammenlebendMitNeuenPartner, NotificationChain msgs) {
		CodeTatsachenbehauptungType oldZusammenlebendMitNeuenPartner = zusammenlebendMitNeuenPartner;
		zusammenlebendMitNeuenPartner = newZusammenlebendMitNeuenPartner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER, oldZusammenlebendMitNeuenPartner, newZusammenlebendMitNeuenPartner);
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
	public void setZusammenlebendMitNeuenPartner(CodeTatsachenbehauptungType newZusammenlebendMitNeuenPartner) {
		if (newZusammenlebendMitNeuenPartner != zusammenlebendMitNeuenPartner) {
			NotificationChain msgs = null;
			if (zusammenlebendMitNeuenPartner != null)
				msgs = ((InternalEObject)zusammenlebendMitNeuenPartner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER, null, msgs);
			if (newZusammenlebendMitNeuenPartner != null)
				msgs = ((InternalEObject)newZusammenlebendMitNeuenPartner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER, null, msgs);
			msgs = basicSetZusammenlebendMitNeuenPartner(newZusammenlebendMitNeuenPartner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER, newZusammenlebendMitNeuenPartner, newZusammenlebendMitNeuenPartner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErreichbarkeitType> getErreichbarkeit() {
		if (erreichbarkeit == null) {
			erreichbarkeit = new EObjectContainmentEList<ErreichbarkeitType>(ErreichbarkeitType.class, this, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT);
		}
		return erreichbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VertretungType> getVertretung() {
		if (vertretung == null) {
			vertretung = new EObjectContainmentEList<VertretungType>(VertretungType.class, this, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG);
		}
		return vertretung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VermoegenAndererElternteilType> getVermoegen() {
		if (vermoegen == null) {
			vermoegen = new EObjectContainmentEList<VermoegenAndererElternteilType>(VermoegenAndererElternteilType.class, this, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERMOEGEN);
		}
		return vermoegen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EinkuenfteAndererElternteilType> getEinkuenfte() {
		if (einkuenfte == null) {
			einkuenfte = new EObjectContainmentEList<EinkuenfteAndererElternteilType>(EinkuenfteAndererElternteilType.class, this, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__EINKUENFTE);
		}
		return einkuenfte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SonstigeLeistungAndererElternteilType> getSonstigeLeistungen() {
		if (sonstigeLeistungen == null) {
			sonstigeLeistungen = new EObjectContainmentEList<SonstigeLeistungAndererElternteilType>(SonstigeLeistungAndererElternteilType.class, this, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__SONSTIGE_LEISTUNGEN);
		}
		return sonstigeLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TraegerKrankenversicherungType getTraegerKrankenversicherung() {
		return traegerKrankenversicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraegerKrankenversicherung(TraegerKrankenversicherungType newTraegerKrankenversicherung, NotificationChain msgs) {
		TraegerKrankenversicherungType oldTraegerKrankenversicherung = traegerKrankenversicherung;
		traegerKrankenversicherung = newTraegerKrankenversicherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG, oldTraegerKrankenversicherung, newTraegerKrankenversicherung);
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
	public void setTraegerKrankenversicherung(TraegerKrankenversicherungType newTraegerKrankenversicherung) {
		if (newTraegerKrankenversicherung != traegerKrankenversicherung) {
			NotificationChain msgs = null;
			if (traegerKrankenversicherung != null)
				msgs = ((InternalEObject)traegerKrankenversicherung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG, null, msgs);
			if (newTraegerKrankenversicherung != null)
				msgs = ((InternalEObject)newTraegerKrankenversicherung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG, null, msgs);
			msgs = basicSetTraegerKrankenversicherung(newTraegerKrankenversicherung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG, newTraegerKrankenversicherung, newTraegerKrankenversicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeitereKinderAndererElternteilType> getWeitereKinder() {
		if (weitereKinder == null) {
			weitereKinder = new EObjectContainmentEList<WeitereKinderAndererElternteilType>(WeitereKinderAndererElternteilType.class, this, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_KINDER);
		}
		return weitereKinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AusbildungAndererElternteilType> getAusbildung() {
		if (ausbildung == null) {
			ausbildung = new EObjectContainmentEList<AusbildungAndererElternteilType>(AusbildungAndererElternteilType.class, this, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__AUSBILDUNG);
		}
		return ausbildung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLeistungsfaehig() {
		return leistungsfaehig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeistungsfaehig(String newLeistungsfaehig) {
		String oldLeistungsfaehig = leistungsfaehig;
		leistungsfaehig = newLeistungsfaehig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__LEISTUNGSFAEHIG, oldLeistungsfaehig, leistungsfaehig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitFreitextType getWeitereAngaben() {
		return weitereAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeitereAngaben(TatsacheMitFreitextType newWeitereAngaben, NotificationChain msgs) {
		TatsacheMitFreitextType oldWeitereAngaben = weitereAngaben;
		weitereAngaben = newWeitereAngaben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN, oldWeitereAngaben, newWeitereAngaben);
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
	public void setWeitereAngaben(TatsacheMitFreitextType newWeitereAngaben) {
		if (newWeitereAngaben != weitereAngaben) {
			NotificationChain msgs = null;
			if (weitereAngaben != null)
				msgs = ((InternalEObject)weitereAngaben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN, null, msgs);
			if (newWeitereAngaben != null)
				msgs = ((InternalEObject)newWeitereAngaben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN, null, msgs);
			msgs = basicSetWeitereAngaben(newWeitereAngaben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN, newWeitereAngaben, newWeitereAngaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGeschlechtType getGeschlecht() {
		return geschlecht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschlecht(CodeGeschlechtType newGeschlecht, NotificationChain msgs) {
		CodeGeschlechtType oldGeschlecht = geschlecht;
		geschlecht = newGeschlecht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT, oldGeschlecht, newGeschlecht);
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
	public void setGeschlecht(CodeGeschlechtType newGeschlecht) {
		if (newGeschlecht != geschlecht) {
			NotificationChain msgs = null;
			if (geschlecht != null)
				msgs = ((InternalEObject)geschlecht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT, null, msgs);
			if (newGeschlecht != null)
				msgs = ((InternalEObject)newGeschlecht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT, null, msgs);
			msgs = basicSetGeschlecht(newGeschlecht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT, newGeschlecht, newGeschlecht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__NAME:
				return basicSetName(null, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				return basicSetKindschaftsbeziehung(null, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT:
				return basicSetAndereRegelmaessigerAufenthaltort(null, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				return basicSetStaatsangehoerigkeit(null, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER:
				return basicSetZusammenlebendMitNeuenPartner(null, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				return ((InternalEList<?>)getErreichbarkeit()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				return ((InternalEList<?>)getVertretung()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERMOEGEN:
				return ((InternalEList<?>)getVermoegen()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__EINKUENFTE:
				return ((InternalEList<?>)getEinkuenfte()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__SONSTIGE_LEISTUNGEN:
				return ((InternalEList<?>)getSonstigeLeistungen()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG:
				return basicSetTraegerKrankenversicherung(null, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_KINDER:
				return ((InternalEList<?>)getWeitereKinder()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__AUSBILDUNG:
				return ((InternalEList<?>)getAusbildung()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN:
				return basicSetWeitereAngaben(null, msgs);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				return basicSetGeschlecht(null, msgs);
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
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__NAME:
				return getName();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				return getGeburt();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANREDE:
				return getAnrede();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				return getKindschaftsbeziehung();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				return getAnschrift();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT:
				return getAndereRegelmaessigerAufenthaltort();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				return getStaatsangehoerigkeit();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER:
				return getZusammenlebendMitNeuenPartner();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				return getErreichbarkeit();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				return getVertretung();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERMOEGEN:
				return getVermoegen();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__EINKUENFTE:
				return getEinkuenfte();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__SONSTIGE_LEISTUNGEN:
				return getSonstigeLeistungen();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG:
				return getTraegerKrankenversicherung();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_KINDER:
				return getWeitereKinder();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__AUSBILDUNG:
				return getAusbildung();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__LEISTUNGSFAEHIG:
				return getLeistungsfaehig();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN:
				return getWeitereAngaben();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				return getGeschlecht();
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
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__NAME:
				setName((NameOptionalType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				setGeburt((GeburtType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANREDE:
				setAnrede((String)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				setKindschaftsbeziehung((CodeKindschaftsbeziehungType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				setAnschrift((AnschriftOptionalType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT:
				setAndereRegelmaessigerAufenthaltort((TatsacheMitFreitextType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitAndererElternteilType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER:
				setZusammenlebendMitNeuenPartner((CodeTatsachenbehauptungType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				getErreichbarkeit().addAll((Collection<? extends ErreichbarkeitType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				getVertretung().clear();
				getVertretung().addAll((Collection<? extends VertretungType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERMOEGEN:
				getVermoegen().clear();
				getVermoegen().addAll((Collection<? extends VermoegenAndererElternteilType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__EINKUENFTE:
				getEinkuenfte().clear();
				getEinkuenfte().addAll((Collection<? extends EinkuenfteAndererElternteilType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__SONSTIGE_LEISTUNGEN:
				getSonstigeLeistungen().clear();
				getSonstigeLeistungen().addAll((Collection<? extends SonstigeLeistungAndererElternteilType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG:
				setTraegerKrankenversicherung((TraegerKrankenversicherungType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_KINDER:
				getWeitereKinder().clear();
				getWeitereKinder().addAll((Collection<? extends WeitereKinderAndererElternteilType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__AUSBILDUNG:
				getAusbildung().clear();
				getAusbildung().addAll((Collection<? extends AusbildungAndererElternteilType>)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__LEISTUNGSFAEHIG:
				setLeistungsfaehig((String)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN:
				setWeitereAngaben((TatsacheMitFreitextType)newValue);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)newValue);
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
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__NAME:
				setName((NameOptionalType)null);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				setGeburt((GeburtType)null);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANREDE:
				setAnrede(ANREDE_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				setKindschaftsbeziehung((CodeKindschaftsbeziehungType)null);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				setAnschrift((AnschriftOptionalType)null);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT:
				setAndereRegelmaessigerAufenthaltort((TatsacheMitFreitextType)null);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitAndererElternteilType)null);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER:
				setZusammenlebendMitNeuenPartner((CodeTatsachenbehauptungType)null);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				getVertretung().clear();
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERMOEGEN:
				getVermoegen().clear();
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__EINKUENFTE:
				getEinkuenfte().clear();
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__SONSTIGE_LEISTUNGEN:
				getSonstigeLeistungen().clear();
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG:
				setTraegerKrankenversicherung((TraegerKrankenversicherungType)null);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_KINDER:
				getWeitereKinder().clear();
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__AUSBILDUNG:
				getAusbildung().clear();
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__LEISTUNGSFAEHIG:
				setLeistungsfaehig(LEISTUNGSFAEHIG_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN:
				setWeitereAngaben((TatsacheMitFreitextType)null);
				return;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)null);
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
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__NAME:
				return name != null;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GEBURT:
				return geburt != null;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANREDE:
				return ANREDE_EDEFAULT == null ? anrede != null : !ANREDE_EDEFAULT.equals(anrede);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__KINDSCHAFTSBEZIEHUNG:
				return kindschaftsbeziehung != null;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANSCHRIFT:
				return anschrift != null;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ANDERE_REGELMAESSIGER_AUFENTHALTORT:
				return andereRegelmaessigerAufenthaltort != null;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__STAATSANGEHOERIGKEIT:
				return staatsangehoerigkeit != null;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ZUSAMMENLEBEND_MIT_NEUEN_PARTNER:
				return zusammenlebendMitNeuenPartner != null;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__ERREICHBARKEIT:
				return erreichbarkeit != null && !erreichbarkeit.isEmpty();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERTRETUNG:
				return vertretung != null && !vertretung.isEmpty();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__VERMOEGEN:
				return vermoegen != null && !vermoegen.isEmpty();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__EINKUENFTE:
				return einkuenfte != null && !einkuenfte.isEmpty();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__SONSTIGE_LEISTUNGEN:
				return sonstigeLeistungen != null && !sonstigeLeistungen.isEmpty();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__TRAEGER_KRANKENVERSICHERUNG:
				return traegerKrankenversicherung != null;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_KINDER:
				return weitereKinder != null && !weitereKinder.isEmpty();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__AUSBILDUNG:
				return ausbildung != null && !ausbildung.isEmpty();
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__LEISTUNGSFAEHIG:
				return LEISTUNGSFAEHIG_EDEFAULT == null ? leistungsfaehig != null : !LEISTUNGSFAEHIG_EDEFAULT.equals(leistungsfaehig);
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__WEITERE_ANGABEN:
				return weitereAngaben != null;
			case UnterhaltsvorschussPackage.ANDERER_ELTERNTEIL_BASIS_TYPE__GESCHLECHT:
				return geschlecht != null;
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
		result.append(" (anrede: ");
		result.append(anrede);
		result.append(", leistungsfaehig: ");
		result.append(leistungsfaehig);
		result.append(')');
		return result.toString();
	}

} //AndererElternteilBasisTypeImpl
