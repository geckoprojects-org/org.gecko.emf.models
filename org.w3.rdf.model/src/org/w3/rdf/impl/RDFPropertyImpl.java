/**
 */
package org.w3.rdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3.rdf.RDFProperty;
import org.w3.rdf.RdfPackage;
import org.w3.rdfs.RDFDomain;
import org.w3.rdfs.Range;
import org.w3.rdfs.RdfsPackage;
import org.w3.rdfs.SubPropertyOf;
import org.w3.rdfs.impl.RDFResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDF Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.impl.RDFPropertyImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.w3.rdf.impl.RDFPropertyImpl#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link org.w3.rdf.impl.RDFPropertyImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDFPropertyImpl extends RDFResourceImpl implements RDFProperty {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected RDFDomain domain;

	/**
	 * The cached value of the '{@link #getSubPropertyOf() <em>Sub Property Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected SubPropertyOf subPropertyOf;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDFPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfPackage.Literals.RDF_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RDFDomain getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (RDFDomain)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfPackage.RDF_PROPERTY__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFDomain basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(RDFDomain newDomain) {
		RDFDomain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfPackage.RDF_PROPERTY__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubPropertyOf getSubPropertyOf() {
		if (subPropertyOf != null && subPropertyOf.eIsProxy()) {
			InternalEObject oldSubPropertyOf = (InternalEObject)subPropertyOf;
			subPropertyOf = (SubPropertyOf)eResolveProxy(oldSubPropertyOf);
			if (subPropertyOf != oldSubPropertyOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF, oldSubPropertyOf, subPropertyOf));
			}
		}
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPropertyOf basicGetSubPropertyOf() {
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPropertyOf(SubPropertyOf newSubPropertyOf, NotificationChain msgs) {
		SubPropertyOf oldSubPropertyOf = subPropertyOf;
		subPropertyOf = newSubPropertyOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF, oldSubPropertyOf, newSubPropertyOf);
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
	public void setSubPropertyOf(SubPropertyOf newSubPropertyOf) {
		if (newSubPropertyOf != subPropertyOf) {
			NotificationChain msgs = null;
			if (subPropertyOf != null)
				msgs = ((InternalEObject)subPropertyOf).eInverseRemove(this, RdfsPackage.SUB_PROPERTY_OF__PROPERTY, SubPropertyOf.class, msgs);
			if (newSubPropertyOf != null)
				msgs = ((InternalEObject)newSubPropertyOf).eInverseAdd(this, RdfsPackage.SUB_PROPERTY_OF__PROPERTY, SubPropertyOf.class, msgs);
			msgs = basicSetSubPropertyOf(newSubPropertyOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF, newSubPropertyOf, newSubPropertyOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getRange() {
		if (range != null && range.eIsProxy()) {
			InternalEObject oldRange = (InternalEObject)range;
			range = (Range)eResolveProxy(oldRange);
			if (range != oldRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdfPackage.RDF_PROPERTY__RANGE, oldRange, range));
			}
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range basicGetRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(Range newRange) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdfPackage.RDF_PROPERTY__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF:
				if (subPropertyOf != null)
					msgs = ((InternalEObject)subPropertyOf).eInverseRemove(this, RdfsPackage.SUB_PROPERTY_OF__PROPERTY, SubPropertyOf.class, msgs);
				return basicSetSubPropertyOf((SubPropertyOf)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF:
				return basicSetSubPropertyOf(null, msgs);
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
			case RdfPackage.RDF_PROPERTY__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF:
				if (resolve) return getSubPropertyOf();
				return basicGetSubPropertyOf();
			case RdfPackage.RDF_PROPERTY__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
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
			case RdfPackage.RDF_PROPERTY__DOMAIN:
				setDomain((RDFDomain)newValue);
				return;
			case RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF:
				setSubPropertyOf((SubPropertyOf)newValue);
				return;
			case RdfPackage.RDF_PROPERTY__RANGE:
				setRange((Range)newValue);
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
			case RdfPackage.RDF_PROPERTY__DOMAIN:
				setDomain((RDFDomain)null);
				return;
			case RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF:
				setSubPropertyOf((SubPropertyOf)null);
				return;
			case RdfPackage.RDF_PROPERTY__RANGE:
				setRange((Range)null);
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
			case RdfPackage.RDF_PROPERTY__DOMAIN:
				return domain != null;
			case RdfPackage.RDF_PROPERTY__SUB_PROPERTY_OF:
				return subPropertyOf != null;
			case RdfPackage.RDF_PROPERTY__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //RDFPropertyImpl
