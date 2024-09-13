/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.w3.rdfs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3.rdf.RDFProperty;

import org.w3.rdfs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.rdfs.RdfsPackage
 * @generated
 */
public class RdfsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdfsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RdfsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfsSwitch<Adapter> modelSwitch =
		new RdfsSwitch<Adapter>() {
			@Override
			public Adapter caseSeeAlso(SeeAlso object) {
				return createSeeAlsoAdapter();
			}
			@Override
			public Adapter caseRDFResource(RDFResource object) {
				return createRDFResourceAdapter();
			}
			@Override
			public Adapter caseRDFLabel(RDFLabel object) {
				return createRDFLabelAdapter();
			}
			@Override
			public Adapter caseRDFLiteral(RDFLiteral object) {
				return createRDFLiteralAdapter();
			}
			@Override
			public Adapter caseRDFContainer(RDFContainer object) {
				return createRDFContainerAdapter();
			}
			@Override
			public Adapter caseRDFClass(RDFClass object) {
				return createRDFClassAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseSubPropertyOf(SubPropertyOf object) {
				return createSubPropertyOfAdapter();
			}
			@Override
			public Adapter caseMember(Member object) {
				return createMemberAdapter();
			}
			@Override
			public Adapter caseSubClassOf(SubClassOf object) {
				return createSubClassOfAdapter();
			}
			@Override
			public Adapter caseIsDefinedBy(IsDefinedBy object) {
				return createIsDefinedByAdapter();
			}
			@Override
			public Adapter caseRDFComment(RDFComment object) {
				return createRDFCommentAdapter();
			}
			@Override
			public Adapter caseRDFDatatype(RDFDatatype object) {
				return createRDFDatatypeAdapter();
			}
			@Override
			public Adapter caseContainerMembershipProperty(ContainerMembershipProperty object) {
				return createContainerMembershipPropertyAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseRDFProperty(RDFProperty object) {
				return createRDFPropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.SeeAlso <em>See Also</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.SeeAlso
	 * @generated
	 */
	public Adapter createSeeAlsoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFResource <em>RDF Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFResource
	 * @generated
	 */
	public Adapter createRDFResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFLabel <em>RDF Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFLabel
	 * @generated
	 */
	public Adapter createRDFLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFLiteral <em>RDF Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFLiteral
	 * @generated
	 */
	public Adapter createRDFLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFContainer <em>RDF Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFContainer
	 * @generated
	 */
	public Adapter createRDFContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFClass <em>RDF Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFClass
	 * @generated
	 */
	public Adapter createRDFClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.SubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.SubPropertyOf
	 * @generated
	 */
	public Adapter createSubPropertyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.SubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.SubClassOf
	 * @generated
	 */
	public Adapter createSubClassOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.IsDefinedBy <em>Is Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.IsDefinedBy
	 * @generated
	 */
	public Adapter createIsDefinedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFComment <em>RDF Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFComment
	 * @generated
	 */
	public Adapter createRDFCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.RDFDatatype <em>RDF Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.RDFDatatype
	 * @generated
	 */
	public Adapter createRDFDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.ContainerMembershipProperty <em>Container Membership Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.ContainerMembershipProperty
	 * @generated
	 */
	public Adapter createContainerMembershipPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdfs.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdfs.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.rdf.RDFProperty <em>RDF Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.rdf.RDFProperty
	 * @generated
	 */
	public Adapter createRDFPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RdfsAdapterFactory
