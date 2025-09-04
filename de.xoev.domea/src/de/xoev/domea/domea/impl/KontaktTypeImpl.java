/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AnschriftType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungType;
import de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType;
import de.xoev.domea.domea.BehoerdeType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.GeburtType;
import de.xoev.domea.domea.KommunikationType;
import de.xoev.domea.domea.KontaktType;
import de.xoev.domea.domea.NameNatuerlichePersonType;
import de.xoev.domea.domea.NameOrganisationType;
import de.xoev.domea.domea.OrganisationseinheitType;
import de.xoev.domea.domea.RolleCodeType;
import de.xoev.domea.domea.UnstrukturierteAnschriftType;

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
 * An implementation of the model object '<em><b>Kontakt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getBehoerdenkennung <em>Behoerdenkennung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getNameInstitution <em>Name Institution</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getNameOrganisationseinheit <em>Name Organisationseinheit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getNameAnsprechpartner <em>Name Ansprechpartner</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getTaetigkeit <em>Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getZustaendigkeit <em>Zustaendigkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getRolle <em>Rolle</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getRolleCode <em>Rolle Code</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getUnstrukturierteAnschrift <em>Unstrukturierte Anschrift</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.KontaktTypeImpl#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KontaktTypeImpl extends MinimalEObjectImpl.Container implements KontaktType {
	/**
	 * The cached value of the '{@link #getBehoerdenkennung() <em>Behoerdenkennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehoerdenkennung()
	 * @generated
	 * @ordered
	 */
	protected BehoerdeType behoerdenkennung;

	/**
	 * The cached value of the '{@link #getNameInstitution() <em>Name Institution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameInstitution()
	 * @generated
	 * @ordered
	 */
	protected NameOrganisationType nameInstitution;

	/**
	 * The cached value of the '{@link #getNameOrganisationseinheit() <em>Name Organisationseinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOrganisationseinheit()
	 * @generated
	 * @ordered
	 */
	protected OrganisationseinheitType nameOrganisationseinheit;

	/**
	 * The cached value of the '{@link #getNameAnsprechpartner() <em>Name Ansprechpartner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAnsprechpartner()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType nameAnsprechpartner;

	/**
	 * The default value of the '{@link #getTaetigkeit() <em>Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final String TAETIGKEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaetigkeit() <em>Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected String taetigkeit = TAETIGKEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getZustaendigkeit() <em>Zustaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZustaendigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSTAENDIGKEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZustaendigkeit() <em>Zustaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZustaendigkeit()
	 * @generated
	 * @ordered
	 */
	protected String zustaendigkeit = ZUSTAENDIGKEIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected EList<AnschriftType> anschrift;

	/**
	 * The cached value of the '{@link #getErreichbarkeit() <em>Erreichbarkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErreichbarkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<KommunikationType> erreichbarkeit;

	/**
	 * The default value of the '{@link #getRolle() <em>Rolle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolle()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolle() <em>Rolle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolle()
	 * @generated
	 * @ordered
	 */
	protected String rolle = ROLLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRolleCode() <em>Rolle Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolleCode()
	 * @generated
	 * @ordered
	 */
	protected RolleCodeType rolleCode;

	/**
	 * The cached value of the '{@link #getUnstrukturierteAnschrift() <em>Unstrukturierte Anschrift</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnstrukturierteAnschrift()
	 * @generated
	 * @ordered
	 */
	protected EList<UnstrukturierteAnschriftType> unstrukturierteAnschrift;

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
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterung() <em>Anwendungsspezifische Erweiterung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterung()
	 * @generated
	 * @ordered
	 */
	protected EList<AnwendungsspezifischeErweiterungType> anwendungsspezifischeErweiterung;

	/**
	 * The cached value of the '{@link #getAnwendungsspezifischeErweiterungXML() <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 * @ordered
	 */
	protected AnwendungsspezifischeErweiterungXMLType anwendungsspezifischeErweiterungXML;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KontaktTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.KONTAKT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdeType getBehoerdenkennung() {
		return behoerdenkennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehoerdenkennung(BehoerdeType newBehoerdenkennung, NotificationChain msgs) {
		BehoerdeType oldBehoerdenkennung = behoerdenkennung;
		behoerdenkennung = newBehoerdenkennung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__BEHOERDENKENNUNG, oldBehoerdenkennung, newBehoerdenkennung);
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
	public void setBehoerdenkennung(BehoerdeType newBehoerdenkennung) {
		if (newBehoerdenkennung != behoerdenkennung) {
			NotificationChain msgs = null;
			if (behoerdenkennung != null)
				msgs = ((InternalEObject)behoerdenkennung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__BEHOERDENKENNUNG, null, msgs);
			if (newBehoerdenkennung != null)
				msgs = ((InternalEObject)newBehoerdenkennung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__BEHOERDENKENNUNG, null, msgs);
			msgs = basicSetBehoerdenkennung(newBehoerdenkennung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__BEHOERDENKENNUNG, newBehoerdenkennung, newBehoerdenkennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameOrganisationType getNameInstitution() {
		return nameInstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameInstitution(NameOrganisationType newNameInstitution, NotificationChain msgs) {
		NameOrganisationType oldNameInstitution = nameInstitution;
		nameInstitution = newNameInstitution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__NAME_INSTITUTION, oldNameInstitution, newNameInstitution);
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
	public void setNameInstitution(NameOrganisationType newNameInstitution) {
		if (newNameInstitution != nameInstitution) {
			NotificationChain msgs = null;
			if (nameInstitution != null)
				msgs = ((InternalEObject)nameInstitution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__NAME_INSTITUTION, null, msgs);
			if (newNameInstitution != null)
				msgs = ((InternalEObject)newNameInstitution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__NAME_INSTITUTION, null, msgs);
			msgs = basicSetNameInstitution(newNameInstitution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__NAME_INSTITUTION, newNameInstitution, newNameInstitution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganisationseinheitType getNameOrganisationseinheit() {
		return nameOrganisationseinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameOrganisationseinheit(OrganisationseinheitType newNameOrganisationseinheit, NotificationChain msgs) {
		OrganisationseinheitType oldNameOrganisationseinheit = nameOrganisationseinheit;
		nameOrganisationseinheit = newNameOrganisationseinheit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT, oldNameOrganisationseinheit, newNameOrganisationseinheit);
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
	public void setNameOrganisationseinheit(OrganisationseinheitType newNameOrganisationseinheit) {
		if (newNameOrganisationseinheit != nameOrganisationseinheit) {
			NotificationChain msgs = null;
			if (nameOrganisationseinheit != null)
				msgs = ((InternalEObject)nameOrganisationseinheit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT, null, msgs);
			if (newNameOrganisationseinheit != null)
				msgs = ((InternalEObject)newNameOrganisationseinheit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT, null, msgs);
			msgs = basicSetNameOrganisationseinheit(newNameOrganisationseinheit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT, newNameOrganisationseinheit, newNameOrganisationseinheit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getNameAnsprechpartner() {
		return nameAnsprechpartner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameAnsprechpartner(NameNatuerlichePersonType newNameAnsprechpartner, NotificationChain msgs) {
		NameNatuerlichePersonType oldNameAnsprechpartner = nameAnsprechpartner;
		nameAnsprechpartner = newNameAnsprechpartner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__NAME_ANSPRECHPARTNER, oldNameAnsprechpartner, newNameAnsprechpartner);
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
	public void setNameAnsprechpartner(NameNatuerlichePersonType newNameAnsprechpartner) {
		if (newNameAnsprechpartner != nameAnsprechpartner) {
			NotificationChain msgs = null;
			if (nameAnsprechpartner != null)
				msgs = ((InternalEObject)nameAnsprechpartner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__NAME_ANSPRECHPARTNER, null, msgs);
			if (newNameAnsprechpartner != null)
				msgs = ((InternalEObject)newNameAnsprechpartner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__NAME_ANSPRECHPARTNER, null, msgs);
			msgs = basicSetNameAnsprechpartner(newNameAnsprechpartner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__NAME_ANSPRECHPARTNER, newNameAnsprechpartner, newNameAnsprechpartner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaetigkeit() {
		return taetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaetigkeit(String newTaetigkeit) {
		String oldTaetigkeit = taetigkeit;
		taetigkeit = newTaetigkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__TAETIGKEIT, oldTaetigkeit, taetigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZustaendigkeit() {
		return zustaendigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustaendigkeit(String newZustaendigkeit) {
		String oldZustaendigkeit = zustaendigkeit;
		zustaendigkeit = newZustaendigkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__ZUSTAENDIGKEIT, oldZustaendigkeit, zustaendigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnschriftType> getAnschrift() {
		if (anschrift == null) {
			anschrift = new EObjectContainmentEList<AnschriftType>(AnschriftType.class, this, DomeaPackage.KONTAKT_TYPE__ANSCHRIFT);
		}
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KommunikationType> getErreichbarkeit() {
		if (erreichbarkeit == null) {
			erreichbarkeit = new EObjectContainmentEList<KommunikationType>(KommunikationType.class, this, DomeaPackage.KONTAKT_TYPE__ERREICHBARKEIT);
		}
		return erreichbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRolle() {
		return rolle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRolle(String newRolle) {
		String oldRolle = rolle;
		rolle = newRolle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__ROLLE, oldRolle, rolle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RolleCodeType getRolleCode() {
		return rolleCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolleCode(RolleCodeType newRolleCode, NotificationChain msgs) {
		RolleCodeType oldRolleCode = rolleCode;
		rolleCode = newRolleCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__ROLLE_CODE, oldRolleCode, newRolleCode);
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
	public void setRolleCode(RolleCodeType newRolleCode) {
		if (newRolleCode != rolleCode) {
			NotificationChain msgs = null;
			if (rolleCode != null)
				msgs = ((InternalEObject)rolleCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__ROLLE_CODE, null, msgs);
			if (newRolleCode != null)
				msgs = ((InternalEObject)newRolleCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__ROLLE_CODE, null, msgs);
			msgs = basicSetRolleCode(newRolleCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__ROLLE_CODE, newRolleCode, newRolleCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnstrukturierteAnschriftType> getUnstrukturierteAnschrift() {
		if (unstrukturierteAnschrift == null) {
			unstrukturierteAnschrift = new EObjectContainmentEList<UnstrukturierteAnschriftType>(UnstrukturierteAnschriftType.class, this, DomeaPackage.KONTAKT_TYPE__UNSTRUKTURIERTE_ANSCHRIFT);
		}
		return unstrukturierteAnschrift;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__GEBURT, oldGeburt, newGeburt);
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
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnwendungsspezifischeErweiterungType> getAnwendungsspezifischeErweiterung() {
		if (anwendungsspezifischeErweiterung == null) {
			anwendungsspezifischeErweiterung = new EObjectContainmentEList<AnwendungsspezifischeErweiterungType>(AnwendungsspezifischeErweiterungType.class, this, DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG);
		}
		return anwendungsspezifischeErweiterung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML() {
		return anwendungsspezifischeErweiterungXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML, NotificationChain msgs) {
		AnwendungsspezifischeErweiterungXMLType oldAnwendungsspezifischeErweiterungXML = anwendungsspezifischeErweiterungXML;
		anwendungsspezifischeErweiterungXML = newAnwendungsspezifischeErweiterungXML;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, oldAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML);
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
	public void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType newAnwendungsspezifischeErweiterungXML) {
		if (newAnwendungsspezifischeErweiterungXML != anwendungsspezifischeErweiterungXML) {
			NotificationChain msgs = null;
			if (anwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)anwendungsspezifischeErweiterungXML).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			if (newAnwendungsspezifischeErweiterungXML != null)
				msgs = ((InternalEObject)newAnwendungsspezifischeErweiterungXML).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, null, msgs);
			msgs = basicSetAnwendungsspezifischeErweiterungXML(newAnwendungsspezifischeErweiterungXML, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML, newAnwendungsspezifischeErweiterungXML, newAnwendungsspezifischeErweiterungXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.KONTAKT_TYPE__BEHOERDENKENNUNG:
				return basicSetBehoerdenkennung(null, msgs);
			case DomeaPackage.KONTAKT_TYPE__NAME_INSTITUTION:
				return basicSetNameInstitution(null, msgs);
			case DomeaPackage.KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT:
				return basicSetNameOrganisationseinheit(null, msgs);
			case DomeaPackage.KONTAKT_TYPE__NAME_ANSPRECHPARTNER:
				return basicSetNameAnsprechpartner(null, msgs);
			case DomeaPackage.KONTAKT_TYPE__ANSCHRIFT:
				return ((InternalEList<?>)getAnschrift()).basicRemove(otherEnd, msgs);
			case DomeaPackage.KONTAKT_TYPE__ERREICHBARKEIT:
				return ((InternalEList<?>)getErreichbarkeit()).basicRemove(otherEnd, msgs);
			case DomeaPackage.KONTAKT_TYPE__ROLLE_CODE:
				return basicSetRolleCode(null, msgs);
			case DomeaPackage.KONTAKT_TYPE__UNSTRUKTURIERTE_ANSCHRIFT:
				return ((InternalEList<?>)getUnstrukturierteAnschrift()).basicRemove(otherEnd, msgs);
			case DomeaPackage.KONTAKT_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return ((InternalEList<?>)getAnwendungsspezifischeErweiterung()).basicRemove(otherEnd, msgs);
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return basicSetAnwendungsspezifischeErweiterungXML(null, msgs);
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
			case DomeaPackage.KONTAKT_TYPE__BEHOERDENKENNUNG:
				return getBehoerdenkennung();
			case DomeaPackage.KONTAKT_TYPE__NAME_INSTITUTION:
				return getNameInstitution();
			case DomeaPackage.KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT:
				return getNameOrganisationseinheit();
			case DomeaPackage.KONTAKT_TYPE__NAME_ANSPRECHPARTNER:
				return getNameAnsprechpartner();
			case DomeaPackage.KONTAKT_TYPE__TAETIGKEIT:
				return getTaetigkeit();
			case DomeaPackage.KONTAKT_TYPE__ZUSTAENDIGKEIT:
				return getZustaendigkeit();
			case DomeaPackage.KONTAKT_TYPE__ANSCHRIFT:
				return getAnschrift();
			case DomeaPackage.KONTAKT_TYPE__ERREICHBARKEIT:
				return getErreichbarkeit();
			case DomeaPackage.KONTAKT_TYPE__ROLLE:
				return getRolle();
			case DomeaPackage.KONTAKT_TYPE__ROLLE_CODE:
				return getRolleCode();
			case DomeaPackage.KONTAKT_TYPE__UNSTRUKTURIERTE_ANSCHRIFT:
				return getUnstrukturierteAnschrift();
			case DomeaPackage.KONTAKT_TYPE__GEBURT:
				return getGeburt();
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return getAnwendungsspezifischeErweiterung();
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return getAnwendungsspezifischeErweiterungXML();
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
			case DomeaPackage.KONTAKT_TYPE__BEHOERDENKENNUNG:
				setBehoerdenkennung((BehoerdeType)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__NAME_INSTITUTION:
				setNameInstitution((NameOrganisationType)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT:
				setNameOrganisationseinheit((OrganisationseinheitType)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__NAME_ANSPRECHPARTNER:
				setNameAnsprechpartner((NameNatuerlichePersonType)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__TAETIGKEIT:
				setTaetigkeit((String)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__ZUSTAENDIGKEIT:
				setZustaendigkeit((String)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__ANSCHRIFT:
				getAnschrift().clear();
				getAnschrift().addAll((Collection<? extends AnschriftType>)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				getErreichbarkeit().addAll((Collection<? extends KommunikationType>)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__ROLLE:
				setRolle((String)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__ROLLE_CODE:
				setRolleCode((RolleCodeType)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__UNSTRUKTURIERTE_ANSCHRIFT:
				getUnstrukturierteAnschrift().clear();
				getUnstrukturierteAnschrift().addAll((Collection<? extends UnstrukturierteAnschriftType>)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__GEBURT:
				setGeburt((GeburtType)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				getAnwendungsspezifischeErweiterung().addAll((Collection<? extends AnwendungsspezifischeErweiterungType>)newValue);
				return;
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)newValue);
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
			case DomeaPackage.KONTAKT_TYPE__BEHOERDENKENNUNG:
				setBehoerdenkennung((BehoerdeType)null);
				return;
			case DomeaPackage.KONTAKT_TYPE__NAME_INSTITUTION:
				setNameInstitution((NameOrganisationType)null);
				return;
			case DomeaPackage.KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT:
				setNameOrganisationseinheit((OrganisationseinheitType)null);
				return;
			case DomeaPackage.KONTAKT_TYPE__NAME_ANSPRECHPARTNER:
				setNameAnsprechpartner((NameNatuerlichePersonType)null);
				return;
			case DomeaPackage.KONTAKT_TYPE__TAETIGKEIT:
				setTaetigkeit(TAETIGKEIT_EDEFAULT);
				return;
			case DomeaPackage.KONTAKT_TYPE__ZUSTAENDIGKEIT:
				setZustaendigkeit(ZUSTAENDIGKEIT_EDEFAULT);
				return;
			case DomeaPackage.KONTAKT_TYPE__ANSCHRIFT:
				getAnschrift().clear();
				return;
			case DomeaPackage.KONTAKT_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				return;
			case DomeaPackage.KONTAKT_TYPE__ROLLE:
				setRolle(ROLLE_EDEFAULT);
				return;
			case DomeaPackage.KONTAKT_TYPE__ROLLE_CODE:
				setRolleCode((RolleCodeType)null);
				return;
			case DomeaPackage.KONTAKT_TYPE__UNSTRUKTURIERTE_ANSCHRIFT:
				getUnstrukturierteAnschrift().clear();
				return;
			case DomeaPackage.KONTAKT_TYPE__GEBURT:
				setGeburt((GeburtType)null);
				return;
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				getAnwendungsspezifischeErweiterung().clear();
				return;
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				setAnwendungsspezifischeErweiterungXML((AnwendungsspezifischeErweiterungXMLType)null);
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
			case DomeaPackage.KONTAKT_TYPE__BEHOERDENKENNUNG:
				return behoerdenkennung != null;
			case DomeaPackage.KONTAKT_TYPE__NAME_INSTITUTION:
				return nameInstitution != null;
			case DomeaPackage.KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT:
				return nameOrganisationseinheit != null;
			case DomeaPackage.KONTAKT_TYPE__NAME_ANSPRECHPARTNER:
				return nameAnsprechpartner != null;
			case DomeaPackage.KONTAKT_TYPE__TAETIGKEIT:
				return TAETIGKEIT_EDEFAULT == null ? taetigkeit != null : !TAETIGKEIT_EDEFAULT.equals(taetigkeit);
			case DomeaPackage.KONTAKT_TYPE__ZUSTAENDIGKEIT:
				return ZUSTAENDIGKEIT_EDEFAULT == null ? zustaendigkeit != null : !ZUSTAENDIGKEIT_EDEFAULT.equals(zustaendigkeit);
			case DomeaPackage.KONTAKT_TYPE__ANSCHRIFT:
				return anschrift != null && !anschrift.isEmpty();
			case DomeaPackage.KONTAKT_TYPE__ERREICHBARKEIT:
				return erreichbarkeit != null && !erreichbarkeit.isEmpty();
			case DomeaPackage.KONTAKT_TYPE__ROLLE:
				return ROLLE_EDEFAULT == null ? rolle != null : !ROLLE_EDEFAULT.equals(rolle);
			case DomeaPackage.KONTAKT_TYPE__ROLLE_CODE:
				return rolleCode != null;
			case DomeaPackage.KONTAKT_TYPE__UNSTRUKTURIERTE_ANSCHRIFT:
				return unstrukturierteAnschrift != null && !unstrukturierteAnschrift.isEmpty();
			case DomeaPackage.KONTAKT_TYPE__GEBURT:
				return geburt != null;
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG:
				return anwendungsspezifischeErweiterung != null && !anwendungsspezifischeErweiterung.isEmpty();
			case DomeaPackage.KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML:
				return anwendungsspezifischeErweiterungXML != null;
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
		result.append(" (taetigkeit: ");
		result.append(taetigkeit);
		result.append(", zustaendigkeit: ");
		result.append(zustaendigkeit);
		result.append(", rolle: ");
		result.append(rolle);
		result.append(')');
		return result.toString();
	}

} //KontaktTypeImpl
